package test.bvk.partner.tokopedia.api.seller.webhook;

import java.net.InetSocketAddress;
import java.net.Proxy;

import org.junit.Test;

import com.bvk.partner.tokopedia.Tokopedia;
import com.bvk.partner.tokopedia.object.TokpedResponse;
import com.bvk.partner.tokopedia.seller.object.WebhookRegister;
import com.bvk.partner.tokopedia.util.Mapper;

public class RegisterWebhookTest {

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
		
		WebhookRegister webhook = new WebhookRegister();
		webhook.fs_id = fs_id;
		webhook.campaign_notification_url = "http://yourstore.com/v1/order/notification";
		webhook.chat_notification_url = "http://yourstore.com/v1/chat/notification";
		/*
		webhook.order_actions_url = "";
		webhook.order_cancellation_url = "";
		webhook.order_confirm_delivery_notification_url = "";
		webhook.order_notification_url = "";
		webhook.order_request_cancellation_url = "";
		webhook.order_status_url = "";
		webhook.product_changes_url = "";
		webhook.product_creation_url = "";
		webhook.product_discussion_url = "";
		webhook.product_edit_url = "";
		webhook.webhook_secret = "";
		*/
		TokpedResponse<String> response = tokopedia.getSellerApi().getWebhookApi().registeredWebhook(webhook);
		System.out.println(Mapper.writeValueAsString(response, true));
	}

}
