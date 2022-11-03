package test.bvk.partner.tokopedia.api.seller.webhook;

import java.net.InetSocketAddress;
import java.net.Proxy;

import org.junit.Test;

import com.bvk.partner.tokopedia.Tokopedia;
import com.bvk.partner.tokopedia.object.TokpedResponse;
import com.bvk.partner.tokopedia.seller.object.WebhookRegister;
import com.bvk.partner.tokopedia.util.Mapper;

public class GetRegisteredWebhookTest {

	@Test
	public void test() {
		Proxy proxy = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress("127.0.0.1", 4567));
		Long fs_id = 17357L;
		String token = "c:qaNnJE2oSFaw9-vTlGDrGw";
		
		Tokopedia tokopedia = Tokopedia.newBuilder()
		.proxy(proxy)
		.token(token)
		.fs_id(fs_id)
		.build();
		
		TokpedResponse<WebhookRegister> response = tokopedia.getSellerApi().getWebhookApi().getRegisteredWebhook();
		System.out.println(Mapper.writeValueAsString(response, true));
	}

}
