package test.bvk.partner.tokopedia.api.seller.order;

import org.junit.Test;

import com.bvk.partner.tokopedia.object.TokpedResponse;
import com.bvk.partner.tokopedia.util.Mapper;

import test.bvk.partner.tokopedia.TestConstants;

public class AcceptOrderTest {

	@Test
	public void test() {
		Long order_id = 1411070828L;
		TokpedResponse<String> response = TestConstants.tokopedia.getSellerApi().getOrderApi().acceptOrder(order_id);
		System.out.println(Mapper.writeValueAsString(response, true));
	}
	
}
