package test.bvk.partner.tokopedia.api.seller.order;

import java.util.List;

import org.junit.Test;

import com.bvk.partner.tokopedia.object.TokpedInquiry;
import com.bvk.partner.tokopedia.object.TokpedResponse;
import com.bvk.partner.tokopedia.seller.object.Order;
import com.bvk.partner.tokopedia.util.Mapper;

import test.bvk.partner.tokopedia.TestConstants;

public class GetAllOrdersTest {

	@Test
	public void test() {
		TokpedInquiry inquiry = new TokpedInquiry();
		//inquiry.shop_id = 14645432L;
		inquiry.from_date = "1667952000";
		inquiry.to_date = "1668038399";
		//inquiry.status = "100";
		TokpedResponse<List<Order>> response = TestConstants.tokopedia.getSellerApi().getOrderApi().getAllOrders(inquiry);
		System.out.println(Mapper.writeValueAsString(response, true));
	}
	
}
