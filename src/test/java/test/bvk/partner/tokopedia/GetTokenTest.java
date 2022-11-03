package test.bvk.partner.tokopedia;

import org.junit.Test;

import com.bvk.partner.tokopedia.Tokopedia;
import com.bvk.partner.tokopedia.object.TokpedToken;
import com.bvk.partner.tokopedia.util.Mapper;

public class GetTokenTest {

	@Test
	public void test() {
		String clientId = "42d815c2add340a39140c2cac06db39a";
		String clientSecret = "67d3231942e84fd4b7458b8bf90d8082";
		
		Tokopedia tokopedia = Tokopedia.newBuilder().build();		
		TokpedToken tptoken = tokopedia.getToken(clientId, clientSecret);
		System.out.println(Mapper.writeValueAsString(tptoken, true));
	}

}
