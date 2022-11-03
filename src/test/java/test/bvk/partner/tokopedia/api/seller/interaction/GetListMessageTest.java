package test.bvk.partner.tokopedia.api.seller.interaction;

import java.util.List;

import org.junit.Test;

import com.bvk.partner.tokopedia.object.TokpedInquiry;
import com.bvk.partner.tokopedia.object.TokpedResponse;
import com.bvk.partner.tokopedia.seller.object.Message;
import com.bvk.partner.tokopedia.util.Mapper;

import test.bvk.partner.tokopedia.Constants;

public class GetListMessageTest {

	@Test
	public void test() {
		Integer filter = 0;
		TokpedInquiry inquiry = new TokpedInquiry();
		inquiry.shop_id = 14645432L;
		inquiry.page = 1;
		inquiry.per_page = 10;		
		TokpedResponse<List<Message>> response = Constants.tokopedia.getSellerApi().getInteractionApi().getListMessage(inquiry, filter);
		System.out.println(Mapper.writeValueAsString(response, true));
	}
	
}
