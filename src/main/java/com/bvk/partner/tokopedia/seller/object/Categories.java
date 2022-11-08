package com.bvk.partner.tokopedia.seller.object;

import java.util.ArrayList;
import java.util.List;

public class Categories {

	public List<Category> categories;
	
	public static class Category {
	    public String name;
	    public String id;
	    public List<Child> child;
	}

	public static class Child {
	    public String name;
	    public String id;
	    public List<Child> child;
	}
	
}
