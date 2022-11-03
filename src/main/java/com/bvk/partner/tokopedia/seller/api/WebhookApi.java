package com.bvk.partner.tokopedia.seller.api;

import com.bvk.partner.tokopedia.Tokopedia;
import com.bvk.partner.tokopedia.object.TokpedRequest;
import com.bvk.partner.tokopedia.object.TokpedResponse;
import com.bvk.partner.tokopedia.seller.object.WebhookPayload;
import com.bvk.partner.tokopedia.seller.object.WebhookRegister;
import com.bvk.partner.tokopedia.seller.object.WebhookTrigger;
import com.bvk.partner.tokopedia.util.Assert;
import com.bvk.partner.tokopedia.util.Mapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import okhttp3.MediaType;
import okhttp3.RequestBody;

public class WebhookApi extends Tokopedia.Api {
	
	private static final String[] TYPES = {"order_status", "order_notification"};

	protected WebhookApi(Tokopedia tokopedia) {
		super(tokopedia);
	}
	
	public TokpedResponse<WebhookRegister> getRegisteredWebhook() {
		TokpedRequest request = TokpedRequest.create()
		.path("/v1/fs/" + fs_id);
		return execute(WebhookRegister.class, request);
	}
	
	public TokpedResponse<String> registeredWebhook(WebhookRegister webhookRegister) {
		byte[] json = Mapper.writeValueAsBytes(webhookRegister);
		RequestBody body = RequestBody.create(json, MediaType.parse("application/json"));
		TokpedRequest request = TokpedRequest.create()
		.path("/v1/fs/" + fs_id + "/register")
		.method(TokpedRequest.Method.POST)
		.body(body);
		return execute(String.class, request);
	}
	
	public TokpedResponse<WebhookPayload> getWebhookPayload(Long order_id, Integer type) {
		Assert.notNull(order_id, "order_id required");
		Assert.isTrue(type != null && type >=0 && type < TYPES.length, "invalid type");
		TokpedRequest request = TokpedRequest.create()
		.path("/v1/order/" + order_id + "/fs/" + fs_id + "/webhook?type=" + TYPES[type]);
		return execute(WebhookPayload.class, request);
	}
	
	public TokpedResponse<String> triggerWebhook(WebhookTrigger webhookTrigger) {
		Assert.isTrue(webhookTrigger.type != null && webhookTrigger.type >=0 && webhookTrigger.type < TYPES.length, "invalid type");
		ObjectNode jnode = Mapper.convert(ObjectNode.class, webhookTrigger);
		jnode.remove("type");
		String type = TYPES[webhookTrigger.type];
		jnode.put("Type", type);
		byte[] json = Mapper.writeValueAsBytes(jnode);
		RequestBody body = RequestBody.create(json, MediaType.parse("application/json"));
		TokpedRequest request = TokpedRequest.create()
		.path("/v1/fs/" + fs_id + "/trigger")
		.method(TokpedRequest.Method.POST)
		.body(body);
		return execute(String.class, request);
	}

}
