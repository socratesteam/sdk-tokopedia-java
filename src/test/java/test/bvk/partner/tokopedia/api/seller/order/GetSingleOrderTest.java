package test.bvk.partner.tokopedia.api.seller.order;

import org.junit.Test;

import com.bvk.partner.tokopedia.object.TokpedResponse;
import com.bvk.partner.tokopedia.seller.object.OrderSingle;
import com.bvk.partner.tokopedia.util.Mapper;

import test.bvk.partner.tokopedia.TestConstants;

public class GetSingleOrderTest {

	@Test
	public void test() {
		Long order_id = 1410211885L; //1406086970L;
		String invoice_num = null; //"INV/20221109/MPL/2805621861";
		TokpedResponse<OrderSingle> response = TestConstants.tokopedia.getSellerApi().getOrderApi().getSingleOrder(order_id, invoice_num);
		System.out.println(Mapper.writeValueAsString(response, true));
	}
	
}
