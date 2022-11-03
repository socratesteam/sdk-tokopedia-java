package test.bvk.partner.tokopedia.api.seller.webhook;

import org.junit.Test;

import com.bvk.partner.tokopedia.object.TokpedResponse;
import com.bvk.partner.tokopedia.seller.object.WebhookRegister;
import com.bvk.partner.tokopedia.util.Mapper;

import test.bvk.partner.tokopedia.Constants;

public class RegisterWebhookTest {

	@Test
	public void test() {
		WebhookRegister webhook = new WebhookRegister();
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
		TokpedResponse<String> response = Constants.tokopedia.getSellerApi().getWebhookApi().registeredWebhook(webhook);
		System.out.println(Mapper.writeValueAsString(response, true));
	}

}
