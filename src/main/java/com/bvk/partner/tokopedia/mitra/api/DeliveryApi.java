package com.bvk.partner.tokopedia.mitra.api;

import com.bvk.partner.tokopedia.Tokopedia;
import com.bvk.partner.tokopedia.mitra.object.DeliveryAssign;
import com.bvk.partner.tokopedia.mitra.object.DeliveryCancelConfirm;
import com.bvk.partner.tokopedia.mitra.object.DeliveryFullConfirm;
import com.bvk.partner.tokopedia.mitra.object.DeliveryOrder;
import com.bvk.partner.tokopedia.mitra.object.DeliveryPartialConfirm;
import com.bvk.partner.tokopedia.mitra.object.DeliveryReschedule;
import com.bvk.partner.tokopedia.mitra.object.DeliveryStatus;
import com.bvk.partner.tokopedia.mitra.object.DriverAssignment;
import com.bvk.partner.tokopedia.mitra.object.DriverInfo;
import com.bvk.partner.tokopedia.mitra.object.MasterReason;
import com.bvk.partner.tokopedia.mitra.object.MitraResponse;
import com.bvk.partner.tokopedia.object.TokpedRequest;
import com.bvk.partner.tokopedia.object.TokpedResponse;
import com.bvk.partner.tokopedia.util.Assert;
import com.bvk.partner.tokopedia.util.Mapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import okhttp3.RequestBody;

public class DeliveryApi extends Tokopedia.Api {

	protected DeliveryApi(Tokopedia tokopedia) {
		super(tokopedia);
	}
	
	public MitraResponse<DriverInfo> registerDriver(Long shop_id, String phone_number, String email) {
		Assert.notNull(shop_id, "shop_id required");
		Assert.hasLength(phone_number, "phone_number required");
		Assert.hasLength(email, "email required");
		ObjectNode jnode = Mapper.createObjectNode();
		jnode.put("shop_id", shop_id);
		jnode.put("phone_number", phone_number);		
		jnode.put("email", email);
		byte[] json = Mapper.writeValueAsBytes(jnode);
		RequestBody body = RequestBody.create(json, JSON);		
		TokpedRequest request = TokpedRequest.create()
		.path("/mitra/integration/v1/fs/" + fs_id + "/driver")
		.method(TokpedRequest.Method.POST)
		.body(body)
		.onlyResponseBody(true);
		TokpedResponse<String> response = execute(String.class, request);
		MitraResponse<DriverInfo> result = MitraResponse.parse(DriverInfo.class, response.getBody());
		return result;
	}
	
	public MitraResponse<DriverInfo> updateDriverStatus(String phone_number, Integer status) {
		Assert.hasLength(phone_number, "phone_number required");
		Assert.notNull(status, "status required");
		ObjectNode jnode = Mapper.createObjectNode();
		jnode.put("phone_number", phone_number);		
		jnode.put("status", status);
		byte[] json = Mapper.writeValueAsBytes(jnode);
		RequestBody body = RequestBody.create(json, JSON);		
		TokpedRequest request = TokpedRequest.create()
		.path("/mitra/integration/v1/fs/" + fs_id + "/driver")
		.method(TokpedRequest.Method.PATCH)
		.body(body)
		.onlyResponseBody(true);
		TokpedResponse<String> response = execute(String.class, request);
		MitraResponse<DriverInfo> result = MitraResponse.parse(DriverInfo.class, response.getBody());
		return result;
	}
	
	public MitraResponse<DriverInfo> getDriverInformation(String phone_number) {
		Assert.hasLength(phone_number, "phone_number required");
		TokpedRequest request = TokpedRequest.create()
		.path("/mitra/integration/v1/fs/" + fs_id + "/drivers/" + phone_number)
		.onlyResponseBody(true);
		TokpedResponse<String> response = execute(String.class, request);
		MitraResponse<DriverInfo> result = MitraResponse.parse(DriverInfo.class, response.getBody());
		return result;
	}
	
	public MitraResponse<DeliveryAssign> assignDelivery(String phone_number, String invoice_num) {
		Assert.hasLength(phone_number, "phone_number required");
		Assert.hasLength(invoice_num, "invoice_num required");		
		ObjectNode jnode = Mapper.createObjectNode();
		jnode.put("invoice_num", invoice_num);
		byte[] json = Mapper.writeValueAsBytes(jnode);
		RequestBody body = RequestBody.create(json, JSON);		
		TokpedRequest request = TokpedRequest.create()
		.path("/mitra/integration/v1/fs/" + fs_id + "/drivers/" + phone_number + "/delivery/assignment")
		.method(TokpedRequest.Method.POST)
		.body(body)
		.onlyResponseBody(true);
		TokpedResponse<String> response = execute(String.class, request);
		MitraResponse<DeliveryAssign> result = MitraResponse.parse(DeliveryAssign.class, response.getBody());
		return result;
	}
	
	public MitraResponse<DriverAssignment> getDriverAssignment(String phone_number, String latitude, String longitude) {
		Assert.hasLength(phone_number, "phone_number required");
		TokpedRequest request = TokpedRequest.create()
		.path("/mitra/integration/v1/fs/" + fs_id + "/drivers/" + phone_number + "/delivery/assignment")
		.onlyResponseBody(true);
		TokpedResponse<String> response = execute(String.class, request);
		MitraResponse<DriverAssignment> result = MitraResponse.parse(DriverAssignment.class, response.getBody());
		return result;
	}
	
	public MitraResponse<DeliveryOrder> getOrderInformation(String phone_number, String invoice_num) {
		Assert.hasLength(phone_number, "phone_number required");
		Assert.hasLength(invoice_num, "invoice_num required");
		TokpedRequest request = TokpedRequest.create()
		.path("/mitra/integration/v1/fs/" + fs_id + "/drivers/" + phone_number + "/delivery/order?invoice_num=" + invoice_num)
		.onlyResponseBody(true);
		TokpedResponse<String> response = execute(String.class, request);
		MitraResponse<DeliveryOrder> result = MitraResponse.parse(DeliveryOrder.class, response.getBody());
		return result;
	}
	
	public MitraResponse<MasterReason> getMasterReason() {
		TokpedRequest request = TokpedRequest.create()
		.path("/mitra/integration/v1/fs/" + fs_id + "/delivery/reason")
		.onlyResponseBody(true);
		TokpedResponse<String> response = execute(String.class, request);
		MitraResponse<MasterReason> result = MitraResponse.parse(MasterReason.class, response.getBody());
		return result;
	}
	
	public MitraResponse<DeliveryStatus> confirmFullDelivery(String phone_number, DeliveryFullConfirm confirm) {
		Assert.hasLength(phone_number, "phone_number required");
		byte[] json = Mapper.writeValueAsBytes(confirm);
		RequestBody body = RequestBody.create(json, JSON);		
		TokpedRequest request = TokpedRequest.create()
		.path("/mitra/integration/v1/fs/" + fs_id + "/drivers/" + phone_number + "/delivery/confirm")
		.method(TokpedRequest.Method.PUT)
		.body(body)
		.onlyResponseBody(true);
		TokpedResponse<String> response = execute(String.class, request);
		MitraResponse<DeliveryStatus> result = MitraResponse.parse(DeliveryStatus.class, response.getBody());
		return result;
	}
	
	public MitraResponse<DeliveryStatus> confirmPartialDelivery(String phone_number, DeliveryPartialConfirm confirm) {
		Assert.hasLength(phone_number, "phone_number required");
		byte[] json = Mapper.writeValueAsBytes(confirm);
		RequestBody body = RequestBody.create(json, JSON);		
		TokpedRequest request = TokpedRequest.create()
		.path("/mitra/integration/v1/fs/" + fs_id + "/drivers/" + phone_number + "/delivery/confirm")
		.method(TokpedRequest.Method.PUT)
		.body(body)
		.onlyResponseBody(true);
		TokpedResponse<String> response = execute(String.class, request);
		MitraResponse<DeliveryStatus> result = MitraResponse.parse(DeliveryStatus.class, response.getBody());
		return result;
	}
	
	public MitraResponse<DeliveryStatus> cancelOrderDelivery(String phone_number, DeliveryCancelConfirm confirm) {
		Assert.hasLength(phone_number, "phone_number required");
		byte[] json = Mapper.writeValueAsBytes(confirm);
		RequestBody body = RequestBody.create(json, JSON);		
		TokpedRequest request = TokpedRequest.create()
		.path("/mitra/integration/v1/fs/" + fs_id + "/drivers/" + phone_number + "/delivery/confirm")
		.method(TokpedRequest.Method.PUT)
		.body(body)
		.onlyResponseBody(true);
		TokpedResponse<String> response = execute(String.class, request);
		MitraResponse<DeliveryStatus> result = MitraResponse.parse(DeliveryStatus.class, response.getBody());
		return result;
	}
	
	public MitraResponse<DeliveryStatus> rescheduleDelivery(String phone_number, DeliveryReschedule reschedule) {
		Assert.hasLength(phone_number, "phone_number required");
		byte[] json = Mapper.writeValueAsBytes(reschedule);
		RequestBody body = RequestBody.create(json, JSON);		
		TokpedRequest request = TokpedRequest.create()
		.path("/mitra/integration/v1/fs/" + fs_id + "/drivers/" + phone_number + "/delivery/reschedule")
		.method(TokpedRequest.Method.PUT)
		.body(body)
		.onlyResponseBody(true);
		TokpedResponse<String> response = execute(String.class, request);
		MitraResponse<DeliveryStatus> result = MitraResponse.parse(DeliveryStatus.class, response.getBody());
		return result;
	}

}
