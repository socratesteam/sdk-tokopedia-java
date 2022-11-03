package test.bvk.partner.tokopedia.api.seller.webhook;

import org.junit.Test;

import com.bvk.partner.tokopedia.object.TokpedResponse;
import com.bvk.partner.tokopedia.seller.object.WebhookPayload;
import com.bvk.partner.tokopedia.util.Mapper;

import test.bvk.partner.tokopedia.Constants;

public class GetWebhookPayloadTest {

	@Test
	public void test() {
		Long order_id = 1234L;
		Integer type = 0;
		TokpedResponse<WebhookPayload> response = Constants.tokopedia.getSellerApi().getWebhookApi().getWebhookPayload(order_id, type);
		System.out.println(Mapper.writeValueAsString(response, true));
	}
	
}
