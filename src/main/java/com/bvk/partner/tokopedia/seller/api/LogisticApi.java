package com.bvk.partner.tokopedia.seller.api;

import com.bvk.partner.tokopedia.Tokopedia;
import com.bvk.partner.tokopedia.object.TokpedRequest;
import com.bvk.partner.tokopedia.object.TokpedResponse;
import com.bvk.partner.tokopedia.seller.object.ActiveCourier;
import com.bvk.partner.tokopedia.seller.object.ShipmentInfo;
import com.bvk.partner.tokopedia.util.Assert;

public class LogisticApi extends Tokopedia.Api {

	protected LogisticApi(Tokopedia tokopedia) {
		super(tokopedia);
	}
	
	public TokpedResponse<ActiveCourier> getActiveCourier(Long shop_id) {
		Assert.notNull(shop_id, "shop_id required");
		TokpedRequest request = TokpedRequest.create()
		.path("/v1/logistic/fs/" + fs_id + "/active-info?shop_id=" + shop_id);
		return execute(ActiveCourier.class, request);
	}
	
	public TokpedResponse<ShipmentInfo> getShipmentInfo(Long shop_id) {
		Assert.notNull(shop_id, "shop_id required");
		TokpedRequest request = TokpedRequest.create()
		.path("/v2/logistic/fs/" + fs_id + "/info?shop_id=" + shop_id);
		return execute(ShipmentInfo.class, request);
	}

}
