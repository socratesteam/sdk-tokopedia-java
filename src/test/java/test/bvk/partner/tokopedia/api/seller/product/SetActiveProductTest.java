package test.bvk.partner.tokopedia.api.seller.product;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.bvk.partner.tokopedia.Tokopedia;
import com.bvk.partner.tokopedia.object.TokpedResponse;
import com.bvk.partner.tokopedia.seller.object.ProductChangeResult;
import com.bvk.partner.tokopedia.util.Mapper;

public class SetActiveProductTest {

	@Test
	public void test() {
		Proxy proxy = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress("127.0.0.1", 4567));
		Long fs_id = 17357L;
		Long shop_id = 14645432L;
		List<Long> product_ids = Arrays.asList(6878809451L);
		String token = "c:qaNnJE2oSFaw9-vTlGDrGw";
		
		Tokopedia tokopedia = Tokopedia.newBuilder()
		.proxy(proxy)
		.token(token)
		.fs_id(fs_id)
		.build();
		
		TokpedResponse<ProductChangeResult> response = tokopedia.getSellerApi().getProductApi().setActiveProduct(shop_id, product_ids);
		System.out.println(Mapper.writeValueAsString(response, true));
	}

}
