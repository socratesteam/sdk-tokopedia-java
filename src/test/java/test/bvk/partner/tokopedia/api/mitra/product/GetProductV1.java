package test.bvk.partner.tokopedia.api.mitra.product;

import org.junit.Test;

import com.bvk.partner.tokopedia.mitra.object.ProductGetV1;
import com.bvk.partner.tokopedia.mitra.object.ProductInputV1;
import com.bvk.partner.tokopedia.object.TokpedResponse;
import com.bvk.partner.tokopedia.util.Mapper;

import test.bvk.partner.tokopedia.TestConstants;

public class GetProductV1 {

	@Test
	public void test() {
		ProductInputV1 input = new ProductInputV1();
		input.shop_id = 14645432L;
		TokpedResponse<ProductGetV1> response = TestConstants.tokopedia.getMitraApi().getProductApi().getProductV1(input);
		System.out.println(Mapper.writeValueAsString(response, true));
	}
	
}
