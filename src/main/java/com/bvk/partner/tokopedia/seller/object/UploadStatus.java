package com.bvk.partner.tokopedia.seller.object;

import java.util.ArrayList;

public class UploadStatus {

	public ArrayList<UploadDatum> upload_data;
	
	public class UploadDatum {
	    public Integer upload_id;
	    public String status;
	    public Integer total_data;
	    public Integer unprocessed_rows;
	    public Integer success_rows;
	    public Integer failed_rows;
	    public Integer processed;
	}
	
}
