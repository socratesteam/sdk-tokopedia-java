package com.bvk.partner.tokopedia.api.seller.webhook;

import java.net.InetSocketAddress;
import java.net.Proxy;

import org.junit.Test;

import com.bvk.partner.tokopedia.Tokopedia;
import com.bvk.partner.tokopedia.object.TokpedResponse;
import com.bvk.partner.tokopedia.seller.object.WebhookPayload;
import com.bvk.partner.tokopedia.util.Mapper;

public class GetWebhookPayloadTest {

	@Test
	public void test() {
		Proxy proxy = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress("127.0.0.1", 4567));
		Long fs_id = 17357L;
		String token = "c:qaNnJE2oSFaw9-vTlGDrGw";
		
		Tokopedia tokopedia = Tokopedia.newBuilder()
		.proxy(proxy)
		.token(token)
		.fs_id(fs_id)
		.build();
		
		Long order_id = 1234L;
		Integer type = 0;
		TokpedResponse<WebhookPayload> response = tokopedia.getSellerApi().getWebhookApi().getWebhookPayload(order_id, type);
		System.out.println(Mapper.writeValueAsString(response, true));
	}
	
}
