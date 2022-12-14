package test.bvk.partner.tokopedia.api.seller.webhook;

import org.junit.Test;

import com.bvk.partner.tokopedia.object.TokpedResponse;
import com.bvk.partner.tokopedia.seller.object.WebhookRegister;
import com.bvk.partner.tokopedia.util.Mapper;

import test.bvk.partner.tokopedia.TestConstants;

public class GetRegisteredWebhookTest {

	@Test
	public void test() {
		TokpedResponse<WebhookRegister> response = TestConstants.tokopedia.getSellerApi().getWebhookApi().getRegisteredWebhook();
		System.out.println(Mapper.writeValueAsString(response, true));
	}

}
