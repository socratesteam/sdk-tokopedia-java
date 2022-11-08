package test.bvk.partner.tokopedia.api.seller.order;

import org.junit.Test;

import com.bvk.partner.tokopedia.object.TokpedResponse;
import com.bvk.partner.tokopedia.util.Mapper;

import test.bvk.partner.tokopedia.TestConstants;

public class GetShippingLabel {

	@Test
	public void test() {
		Long order_id = 1406086970L;
		TokpedResponse<String> response = TestConstants.tokopedia.getSellerApi().getOrderApi().getShippingLabel(order_id, false);
		System.out.println(Mapper.writeValueAsString(response, true));
	}
	
}
