package com.bvk.partner.tokopedia.seller.object;

import java.util.ArrayList;

public class ProductVariant {

	public Integer category_id;
    public ArrayList<ArrayList<Integer>> variant_id_combinations;
    public ArrayList<VariantDetail> variant_details;

	public static class Unit{
	    public Integer variant_unit_id;
	    public Integer status;
	    public String unit_name;
	    public String unit_short_name;
	    public ArrayList<UnitValue> unit_values;
	}

	public static class UnitValue{
	    public Integer variant_unit_value_id;
	    public Integer status;
	    public String value;
	    public Integer equivalent_value_id;
	    public String english_value;
	    public String hex;
	    public String icon;
	}

	public static class VariantDetail{
	    public Integer variant_id;
	    public Integer has_unit;
	    public String identifier;
	    public String name;
	    public Integer status;
	    public ArrayList<Unit> units;
	    public Integer is_primary;
	}
	
}
