package test.bvk.partner.tokopedia.api.seller.order;

import org.junit.Test;

import com.bvk.partner.tokopedia.object.TokpedResponse;
import com.bvk.partner.tokopedia.seller.object.OrderReject;
import com.bvk.partner.tokopedia.util.Mapper;

import test.bvk.partner.tokopedia.TestConstants;

public class RejectOrderTest {

	@Test
	public void test() {
		Long order_id = 1411070828L;
		OrderReject order_reject = new OrderReject();
		order_reject.reason_code = 5;
		order_reject.reason = "Maaf tidak ada pegawai di lokasi";
		TokpedResponse<String> response = TestConstants.tokopedia.getSellerApi().getOrderApi().rejectOrder(order_id, order_reject);
		System.out.println(Mapper.writeValueAsString(response, true));
	}
	
}
