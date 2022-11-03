package com.bvk.partner.tokopedia.seller.object;

import java.util.ArrayList;

public class Categories {

	public ArrayList<Category> categories;
	
	public static class Category {
	    public String name;
	    public String id;
	    public ArrayList<Child> child;
	}

	public static class Child {
	    public String name;
	    public String id;
	    public ArrayList<Child> child;
	}
	
}
