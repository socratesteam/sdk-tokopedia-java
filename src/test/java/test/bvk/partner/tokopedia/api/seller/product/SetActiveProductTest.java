package test.bvk.partner.tokopedia.api.seller.product;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.bvk.partner.tokopedia.object.TokpedResponse;
import com.bvk.partner.tokopedia.seller.object.ProductChangeResult;
import com.bvk.partner.tokopedia.util.Mapper;

import test.bvk.partner.tokopedia.Constants;

public class SetActiveProductTest {

	@Test
	public void test() {
		Long shop_id = 14645432L;
		List<Long> product_ids = Arrays.asList(6878809451L);
		TokpedResponse<ProductChangeResult> response = Constants.tokopedia.getSellerApi().getProductApi().setActiveProduct(shop_id, product_ids);
		System.out.println(Mapper.writeValueAsString(response, true));
	}

}
