package test.bvk.partner.tokopedia.api.seller.interaction;

import org.junit.Test;

import com.bvk.partner.tokopedia.object.TokpedResponse;
import com.bvk.partner.tokopedia.seller.object.ReplyInput;
import com.bvk.partner.tokopedia.seller.object.ReplyResult;
import com.bvk.partner.tokopedia.util.Mapper;

import test.bvk.partner.tokopedia.TestConstants;

public class SendReplyTest {

	@Test
	public void test() {
		Long msg_id = 2267576597L;
		ReplyInput replyInput = new ReplyInput();
		replyInput.shop_id = 14645432L;
		replyInput.message = "Gak kena ayu tingting";
		TokpedResponse<ReplyResult> response = TestConstants.tokopedia.getSellerApi().getInteractionApi().sendReply(msg_id, replyInput);
		System.out.println(Mapper.writeValueAsString(response, true));
	}
	
}
