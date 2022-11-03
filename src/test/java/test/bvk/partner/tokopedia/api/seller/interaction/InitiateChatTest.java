package test.bvk.partner.tokopedia.api.seller.interaction;

import org.junit.Test;

import com.bvk.partner.tokopedia.object.TokpedResponse;
import com.bvk.partner.tokopedia.seller.object.InitiateChat;
import com.bvk.partner.tokopedia.util.Mapper;

import test.bvk.partner.tokopedia.Constants;

public class InitiateChatTest {

	@Test
	public void test() {
		Long order_id = 123456L;	
		TokpedResponse<InitiateChat> response = Constants.tokopedia.getSellerApi().getInteractionApi().initiateChat(order_id);
		System.out.println(Mapper.writeValueAsString(response, true));
	}
	
}
