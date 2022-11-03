package com.bvk.partner.tokopedia.seller.api;

import java.util.List;

import com.bvk.partner.tokopedia.Tokopedia;
import com.bvk.partner.tokopedia.object.TokpedInquiry;
import com.bvk.partner.tokopedia.object.TokpedRequest;
import com.bvk.partner.tokopedia.object.TokpedResponse;
import com.bvk.partner.tokopedia.seller.object.SaldoHistory;
import com.bvk.partner.tokopedia.util.Assert;
import com.fasterxml.jackson.core.type.TypeReference;

public class FinanceApi extends Tokopedia.Api {

	protected FinanceApi(Tokopedia tokopedia) {
		super(tokopedia);
	}
	
	public TokpedResponse<List<SaldoHistory>> getSaldoHistory(TokpedInquiry inquiry, Boolean export) {
		Assert.notNull(inquiry, "inquiry required");
		Assert.notNull(inquiry.shop_id, "shop_id required");
		Assert.hasLength(inquiry.from_date, "from_date required");
		Assert.hasLength(inquiry.to_date, "to_date required");
		Integer page = inquiry.page;
		if (page == null) {
			page = 1;
		}
		Integer per_page = inquiry.per_page;
		if (per_page == null) {
			per_page = 10;
		}
		boolean isExport = Boolean.TRUE.equals(export);
		String query = 
		"from_date=" + inquiry.from_date +
		"&to_date=" + inquiry.to_date + 
		"&page=" + page + 
		"&per_page=" + per_page +
		"&export=" + (isExport ? 1 : 0);
		TokpedRequest request = TokpedRequest.create()
		.path("/v1/fs/" + fs_id + "/shop/" + inquiry.shop_id + "/saldo-history?" + query);
		return execute(new TypeReference<List<SaldoHistory>>() {}, request);		
	}

}
