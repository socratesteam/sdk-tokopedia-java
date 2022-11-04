package test.bvk.partner.tokopedia.api.seller.logistic;

import org.junit.Test;

import com.bvk.partner.tokopedia.object.TokpedResponse;
import com.bvk.partner.tokopedia.seller.object.ActiveCourier;
import com.bvk.partner.tokopedia.util.Mapper;

import test.bvk.partner.tokopedia.TestConstants;

public class GetActiveCourierTest {

	@Test
	public void test() {
		Long shop_id = 14645432L;
		TokpedResponse<ActiveCourier> response = TestConstants.tokopedia.getSellerApi().getLogisticApi().getActiveCourier(shop_id);
		System.out.println(Mapper.writeValueAsString(response, true));
	}
	
}
