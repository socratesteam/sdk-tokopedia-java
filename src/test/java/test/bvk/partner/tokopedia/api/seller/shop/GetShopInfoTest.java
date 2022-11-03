package test.bvk.partner.tokopedia.api.seller.shop;

import java.util.List;

import org.junit.Test;

import com.bvk.partner.tokopedia.object.TokpedInquiry;
import com.bvk.partner.tokopedia.object.TokpedResponse;
import com.bvk.partner.tokopedia.seller.object.Shop;
import com.bvk.partner.tokopedia.util.Mapper;

import test.bvk.partner.tokopedia.Constants;

public class GetShopInfoTest {

	@Test
	public void test() {
		TokpedInquiry inquiry = new TokpedInquiry();
		inquiry.page = 1;
		inquiry.per_page = 10;		
		TokpedResponse<List<Shop>> response = Constants.tokopedia.getSellerApi().getShopApi().getShopInfo(inquiry);
		System.out.println(Mapper.writeValueAsString(response, true));
	}

}
