package test.bvk.partner.tokopedia;

import java.net.InetSocketAddress;
import java.net.Proxy;

import com.bvk.partner.tokopedia.Tokopedia;

public abstract class Constants {

	public static final String clientId = "";
	public static final String clientSecret = "";
	
	private static final Proxy proxy = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress("127.0.0.1", 4567));
	private static final String token = "c:qaNnJE2oSFaw9-vTlGDrGw";
	private static final Long fs_id = 17357L;
	
	public static final Tokopedia tokopedia;
	static {
		tokopedia = Tokopedia.newBuilder()
		.proxy(proxy)
		.token(token)
		.fs_id(fs_id)
		.build();
	}
	
	
	
}
