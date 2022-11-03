package com.bvk.partner.tokopedia.api.seller.product;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;

import org.junit.Test;

import com.bvk.partner.tokopedia.Tokopedia;
import com.bvk.partner.tokopedia.object.TokpedResponse;
import com.bvk.partner.tokopedia.seller.object.ProductGet;
import com.bvk.partner.tokopedia.util.Mapper;

public class GetProductTest {

	@Test
	public void test() {
		Proxy proxy = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress("127.0.0.1", 4567));
		Long fs_id = 17357L;
		Long product_id = 6877767379L;
		String token = "c:qaNnJE2oSFaw9-vTlGDrGw";
		
		Tokopedia tokopedia = Tokopedia.newBuilder()
		.proxy(proxy)
		.token(token)
		.fs_id(fs_id)
		.build();
		
		TokpedResponse<List<ProductGet>> response = tokopedia.getSellerApi().getProductApi().getProduct(product_id);
		System.out.println(Mapper.writeValueAsString(response, true));
	}

}
