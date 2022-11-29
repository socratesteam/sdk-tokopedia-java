package test.bvk.partner.tokopedia.api.seller.interaction;

import org.junit.Test;

import com.bvk.partner.tokopedia.object.TokpedResponse;
import com.bvk.partner.tokopedia.seller.object.InitiateChat;
import com.bvk.partner.tokopedia.util.Mapper;

import test.bvk.partner.tokopedia.TestConstants;

public class InitiateChatTest {

	@Test
	public void test() {
		Long order_id = 1411070828L;	
		TokpedResponse<InitiateChat> response = TestConstants.tokopedia.getSellerApi().getInteractionApi().initiateChat(order_id);
		System.out.println(Mapper.writeValueAsString(response, true));
	}
	
}
