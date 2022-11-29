package test.bvk.partner.tokopedia;

import java.net.InetSocketAddress;
import java.net.Proxy;

import com.bvk.partner.tokopedia.Tokopedia;

public abstract class TestConstants {

	public static final String clientId = "42d815c2add340a39140c2cac06db39a";
	public static final String clientSecret = "67d3231942e84fd4b7458b8bf90d8082";
	
	private static final Proxy proxy = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress("127.0.0.1", 4567));
	private static final String token = "c:cSJCSjbjQgKdVDHWPorlQg";
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
