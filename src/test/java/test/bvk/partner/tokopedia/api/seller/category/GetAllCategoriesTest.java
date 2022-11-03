package test.bvk.partner.tokopedia.api.seller.category;

import org.junit.Test;

import com.bvk.partner.tokopedia.object.TokpedResponse;
import com.bvk.partner.tokopedia.seller.object.Categories;
import com.bvk.partner.tokopedia.util.Mapper;

import test.bvk.partner.tokopedia.Constants;

public class GetAllCategoriesTest {

	@Test
	public void test() {
		String keyword = "";
		TokpedResponse<Categories> response = Constants.tokopedia.getSellerApi().getCategoryApi().getAllCategories(keyword);
		System.out.println(Mapper.writeValueAsString(response, true));
	}
	
}
