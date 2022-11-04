package test.bvk.partner.tokopedia.api.seller.interaction;

import java.util.List;

import org.junit.Test;

import com.bvk.partner.tokopedia.object.TokpedInquiry;
import com.bvk.partner.tokopedia.object.TokpedResponse;
import com.bvk.partner.tokopedia.seller.object.Reply;
import com.bvk.partner.tokopedia.util.Mapper;

import test.bvk.partner.tokopedia.TestConstants;

public class GetListReplyTest {

	@Test
	public void test() {
		Long msg_id = 2267576597L;
		TokpedInquiry inquiry = new TokpedInquiry();
		inquiry.shop_id = 14645432L;
		inquiry.page = 1;
		inquiry.per_page = 10;		
		TokpedResponse<List<Reply>> response = TestConstants.tokopedia.getSellerApi().getInteractionApi().getListReply(inquiry, msg_id);
		System.out.println(Mapper.writeValueAsString(response, true));
	}
	
}
