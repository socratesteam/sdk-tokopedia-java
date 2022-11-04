package test.bvk.partner.tokopedia.api;

import org.junit.Test;

import com.bvk.partner.tokopedia.Tokopedia;
import com.bvk.partner.tokopedia.object.TokpedToken;
import com.bvk.partner.tokopedia.util.Mapper;

import test.bvk.partner.tokopedia.TestConstants;

public class GetTokenTest {

	@Test
	public void test() {
		Tokopedia tokopedia = Tokopedia.newBuilder().build();		
		TokpedToken tptoken = tokopedia.getToken(TestConstants.clientId, TestConstants.clientSecret);
		System.out.println(Mapper.writeValueAsString(tptoken, true));
	}

}
