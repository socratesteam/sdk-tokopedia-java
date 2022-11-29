package test.bvk.partner.tokopedia.api.seller.order;

import org.junit.Test;

import com.bvk.partner.tokopedia.object.TokpedResponse;
import com.bvk.partner.tokopedia.seller.object.RequestPickup;
import com.bvk.partner.tokopedia.util.Mapper;

import test.bvk.partner.tokopedia.TestConstants;

public class RequestPickupTest {

	@Test
	public void test() {
		Long order_id = 1410211885L;
		Long shop_id = 14645432L;
		TokpedResponse<RequestPickup> response = TestConstants.tokopedia.getSellerApi().getOrderApi().requestPickup(order_id, shop_id);
		System.out.println(Mapper.writeValueAsString(response, true));
	}
	
}
