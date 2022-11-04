package com.bvk.partner.tokopedia.mitra.object;

import java.util.ArrayList;
import java.util.List;

public class DeliveryCancelConfirm {

	public String invoice_number;
    public Integer confirm_type = 1;
    public List<ReasonHeader> reason_header;
    
	public static class EvidenceDetailInfo{
	    public Long evidence_id;
	    public String value;
	}

	public static class ReasonHeader{
	    public Long reason_id;
	    public String reason;
	    public ArrayList<EvidenceDetailInfo> evidence_detail_info;
	}
	
}
