package test.bvk.partner.tokopedia.api.seller.finance;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;

import org.junit.Test;

import com.bvk.partner.tokopedia.Tokopedia;
import com.bvk.partner.tokopedia.object.TokpedInquiry;
import com.bvk.partner.tokopedia.object.TokpedResponse;
import com.bvk.partner.tokopedia.seller.object.SaldoHistory;
import com.bvk.partner.tokopedia.util.Mapper;

public class GetSaldoHistoryTest {

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
		
		Boolean export = false;
		TokpedInquiry inquiry = new TokpedInquiry();
		inquiry.shop_id = 14645432L;
		inquiry.from_date = "1664609444000";
		inquiry.to_date = "1672471844000";
		inquiry.page = 1;
		inquiry.per_page = 10;		
		TokpedResponse<List<SaldoHistory>> response = tokopedia.getSellerApi().getFinanceApi().getSaldoHistory(inquiry, export);
		System.out.println(Mapper.writeValueAsString(response, true));
	}
	
}