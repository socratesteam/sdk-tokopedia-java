package test.bvk.partner.tokopedia.api.mitra.delivery;

import org.junit.Test;

import com.bvk.partner.tokopedia.mitra.object.MasterReason;
import com.bvk.partner.tokopedia.mitra.object.MitraResponse;
import com.bvk.partner.tokopedia.util.Mapper;

import test.bvk.partner.tokopedia.TestConstants;

public class GetMasterReason {

	@Test
	public void test() {
		MitraResponse<MasterReason> response = TestConstants.tokopedia.getMitraApi().getDeliveryApi().getMasterReason();
		System.out.println(Mapper.writeValueAsString(response, true));
	}
	
}
