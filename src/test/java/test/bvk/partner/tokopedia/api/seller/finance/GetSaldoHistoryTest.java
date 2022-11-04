package test.bvk.partner.tokopedia.api.seller.finance;

import java.util.List;

import org.junit.Test;

import com.bvk.partner.tokopedia.object.TokpedInquiry;
import com.bvk.partner.tokopedia.object.TokpedResponse;
import com.bvk.partner.tokopedia.seller.object.SaldoHistory;
import com.bvk.partner.tokopedia.util.Mapper;

import test.bvk.partner.tokopedia.TestConstants;

public class GetSaldoHistoryTest {

	@Test
	public void test() {
		Boolean export = false;
		TokpedInquiry inquiry = new TokpedInquiry();
		inquiry.shop_id = 14645432L;
		inquiry.from_date = "1664609444000";
		inquiry.to_date = "1672471844000";
		inquiry.page = 1;
		inquiry.per_page = 10;		
		TokpedResponse<List<SaldoHistory>> response = TestConstants.tokopedia.getSellerApi().getFinanceApi().getSaldoHistory(inquiry, export);
		System.out.println(Mapper.writeValueAsString(response, true));
	}
	
}
