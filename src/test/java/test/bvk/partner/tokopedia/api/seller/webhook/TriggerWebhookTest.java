package test.bvk.partner.tokopedia.api.seller.webhook;

import org.junit.Test;

import com.bvk.partner.tokopedia.object.TokpedResponse;
import com.bvk.partner.tokopedia.seller.object.WebhookTrigger;
import com.bvk.partner.tokopedia.util.Mapper;

import test.bvk.partner.tokopedia.Constants;

public class TriggerWebhookTest {

	@Test
	public void test() {
		WebhookTrigger trigger = new WebhookTrigger();
		trigger.is_encrypted = true;
		trigger.order_id = 1992191442L;
		trigger.url = "https://webhook.site/662b4823-599f-4455-b349-32c43701f72b";
		trigger.type = 0;
		TokpedResponse<String> response = Constants.tokopedia.getSellerApi().getWebhookApi().triggerWebhook(trigger);
		System.out.println(Mapper.writeValueAsString(response, true));
	}
	
}
