package com.bvk.partner.tokopedia.seller.object;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ActiveCourier {

	@JsonProperty("Shops") 
    public ArrayList<Shop> shops;

	public static class ShipmentInfo{
	    @JsonProperty("ShipmentID") 
	    public Long shipmentID;
	    @JsonProperty("ShipmentName") 
	    public String shipmentName;
	    @JsonProperty("ShipmentCode") 
	    public String shipmentCode;
	    @JsonProperty("ShipmentAvailable") 
	    public Integer shipmentAvailable;
	    @JsonProperty("ShipmentImage") 
	    public String shipmentImage;
	    @JsonProperty("ShipmentPackages") 
	    public ArrayList<ShipmentPackage> shipmentPackages;
	    @JsonProperty("AWBStatus") 
	    public Integer aWBStatus;
	}

	public static class ShipmentPackage{
	    @JsonProperty("IsAvailable") 
	    public Integer isAvailable;
	    @JsonProperty("ProductName") 
	    public String productName;
	    @JsonProperty("ShippingProductID") 
	    public Long shippingProductID;
	}

	public static class Shop{
	    @JsonProperty("ShopID") 
	    public Long shopID;
	    @JsonProperty("ShipmentInfos") 
	    public ArrayList<ShipmentInfo> shipmentInfos;
	}
	
}
