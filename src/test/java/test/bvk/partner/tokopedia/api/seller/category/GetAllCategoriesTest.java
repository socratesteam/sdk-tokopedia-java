package test.bvk.partner.tokopedia.api.seller.category;

import java.net.InetSocketAddress;
import java.net.Proxy;

import org.junit.Test;

import com.bvk.partner.tokopedia.Tokopedia;
import com.bvk.partner.tokopedia.object.TokpedResponse;
import com.bvk.partner.tokopedia.seller.object.Categories;
import com.bvk.partner.tokopedia.util.Mapper;

public class GetAllCategoriesTest {

	@Test
	public void test() {
		Proxy proxy = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress("127.0.0.1", 4567));
		Long fs_id = 17357L;
		String token = "c:qaNnJE2oSFaw9-vTlGDrGw";
		String keyword = "handphone";
		
		Tokopedia tokopedia = Tokopedia.newBuilder()
		.proxy(proxy)
		.token(token)
		.fs_id(fs_id)
		.build();
		
		TokpedResponse<Categories> response = tokopedia.getSellerApi().getCategoryApi().getAllCategories(keyword);
		System.out.println(Mapper.writeValueAsString(response, true));
	}
	
}
