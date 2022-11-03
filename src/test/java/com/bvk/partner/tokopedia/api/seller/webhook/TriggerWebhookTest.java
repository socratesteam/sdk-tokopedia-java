package com.bvk.partner.tokopedia.api.seller.webhook;

import java.net.InetSocketAddress;
import java.net.Proxy;

import org.junit.Test;

import com.bvk.partner.tokopedia.Tokopedia;
import com.bvk.partner.tokopedia.object.TokpedResponse;
import com.bvk.partner.tokopedia.seller.object.WebhookTrigger;
import com.bvk.partner.tokopedia.util.Mapper;

public class TriggerWebhookTest {

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
		
		WebhookTrigger trigger = new WebhookTrigger();
		trigger.is_encrypted = true;
		trigger.order_id = 1992191442L;
		trigger.url = "https://webhook.site/662b4823-599f-4455-b349-32c43701f72b";
		trigger.type = 0;
		TokpedResponse<String> response = tokopedia.getSellerApi().getWebhookApi().triggerWebhook(trigger);
		System.out.println(Mapper.writeValueAsString(response, true));
	}
	
}
