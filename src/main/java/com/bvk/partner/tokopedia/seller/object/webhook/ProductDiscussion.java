package com.bvk.partner.tokopedia.seller.object.webhook;

public class ProductDiscussion {

	public Long fs_id;
    public String discussion_type;
    public DiscussionData discussion_data;
	
	public static class CreateTime{
	    public String original;
	    public Long unix;
	}

	public static class DiscussionData {
	    public String id;
	    public Long product_id;
	    public Long shop_id;
	    public Long user_id;
	    public String message;
	    public CreateTime create_time;
	}
	
}
