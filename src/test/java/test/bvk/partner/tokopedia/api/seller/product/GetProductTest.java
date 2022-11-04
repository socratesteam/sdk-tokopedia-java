package test.bvk.partner.tokopedia.api.seller.product;

import java.util.List;

import org.junit.Test;

import com.bvk.partner.tokopedia.object.TokpedResponse;
import com.bvk.partner.tokopedia.seller.object.ProductGet;
import com.bvk.partner.tokopedia.util.Mapper;

import test.bvk.partner.tokopedia.TestConstants;

public class GetProductTest {

	@Test
	public void test() {
		Long product_id = 6877767379L;
		TokpedResponse<List<ProductGet>> response = TestConstants.tokopedia.getSellerApi().getProductApi().getProduct(product_id);
		System.out.println(Mapper.writeValueAsString(response, true));
	}

}
