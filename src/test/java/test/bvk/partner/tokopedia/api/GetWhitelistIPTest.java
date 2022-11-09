package test.bvk.partner.tokopedia.api;

import org.junit.Test;

import com.bvk.partner.tokopedia.object.TokpedResponse;
import com.bvk.partner.tokopedia.object.TokpedWhitelistIP;
import com.bvk.partner.tokopedia.util.Mapper;

import test.bvk.partner.tokopedia.TestConstants;

public class GetWhitelistIPTest {

	@Test
	public void test() {
		TokpedResponse<TokpedWhitelistIP> response = TestConstants.tokopedia.getWhitelistIP();
		System.out.println(Mapper.writeValueAsString(response, true));
	}
	
}
