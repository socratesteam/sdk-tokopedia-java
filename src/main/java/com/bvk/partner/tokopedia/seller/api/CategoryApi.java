package com.bvk.partner.tokopedia.seller.api;

import com.bvk.partner.tokopedia.Tokopedia;
import com.bvk.partner.tokopedia.object.TokpedRequest;
import com.bvk.partner.tokopedia.object.TokpedResponse;
import com.bvk.partner.tokopedia.seller.object.Categories;

public class CategoryApi extends Tokopedia.Api {

	protected CategoryApi(Tokopedia tokopedia) {
		super(tokopedia);
	}
	
	public TokpedResponse<Categories> getAllCategories(String keyword) {
		String query = keyword != null ? "keyword=" + keyword : "";		
		TokpedRequest request = TokpedRequest.create()
		.path("/inventory/v1/fs/" + fs_id + "/product/category?" + query);
		return execute(Categories.class, request);
	}

}
