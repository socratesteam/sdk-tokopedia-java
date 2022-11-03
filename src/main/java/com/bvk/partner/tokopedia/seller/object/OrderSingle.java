package com.bvk.partner.tokopedia.seller.object;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderSingle {

	public int order_id;
    public int buyer_id;
    public int seller_id;
    public int payment_id;
    public boolean is_affiliate;
    public boolean is_fulfillment;
    public OrderWarehouse order_warehouse;
    public int order_status;
    public String invoice_number;
    public String invoice_pdf;
    public String invoice_url;
    public int open_amt;
    public int lp_amt;
    public int cashback_amt;
    public String info;
    public String comment;
    public int item_price;
    public BuyerInfo buyer_info;
    public ShopInfo shop_info;
    public ShipmentFulfillment shipment_fulfillment;
    public Preorder preorder;
    public OrderInfo order_info;
    public OriginInfo origin_info;
    public PaymentInfo payment_info;
    public InsuranceInfo insurance_info;
    public String hold_info;
    public String cancel_request_info;
    public String create_time;
    public String shipping_date;
    public String update_time;
    public String payment_date;
    public String delivered_date;
    public String est_shipping_date;
    public String est_delivery_date;
    public String related_invoices;
    public String custom_fields;
    
	public static class BuyerInfo {
	    public Integer buyer_id;
	    public String buyer_fullname;
	    public String buyer_email;
	    public String buyer_phone;
	}

	public static class Destination {
	    public String receiver_name;
	    public String receiver_phone;
	    public String address_street;
	    public String address_district;
	    public String address_city;
	    public String address_province;
	    public String address_postal;
	    public Integer customer_address_id;
	    public Integer district_id;
	    public Integer city_id;
	    public Integer province_id;
	}

	public static class DestinationLoc {
	    public Integer lat;
	    public Integer lon;
	}

	public static class InsuranceInfo {
	    public Integer insurance_type;
	}

	public static class ItemDeliveredDeadline {
	    @JsonProperty("Time") 
	    public String time;
	    @JsonProperty("Valid") 
	    public Boolean valid;
	}

	public static class MetaData {
	    public Integer warehouse_id;
	    public Integer partner_id;
	    public Integer shop_id;
	    public String warehouse_name;
	    public Integer district_id;
	    public String district_name;
	    public Integer city_id;
	    public String city_name;
	    public Integer province_id;
	    public String province_name;
	    public Integer status;
	    public String postal_code;
	    public Integer is_default;
	    public String latlon;
	    public String latitude;
	    public String longitude;
	    public String email;
	    public String address_detail;
	    public String country_name;
	    public Boolean is_fulfillment;
	}

	public static class OrderDetail {
	    public Integer order_detail_id;
	    public Integer product_id;
	    public String product_name;
	    public String product_desc_pdp;
	    public String product_desc_atc;
	    public Integer product_price;
	    public Integer subtotal_price;
	    public Double weight;
	    public Double total_weight;
	    public Integer quantity;
	    public Integer quantity_deliver;
	    public Integer quantity_reject;
	    public Boolean is_free_returns;
	    public Integer insurance_price;
	    public Integer normal_price;
	    public Integer currency_id;
	    public Integer currency_rate;
	    public Integer min_order;
	    public Integer child_cat_id;
	    public String campaign_id;
	    public String product_picture;
	    public String snapshot_url;
	    public String sku;
	}

	public static class OrderHistory {
	    public String action_by;
	    public Integer hist_status_code;
	    public String message;
	    public String timestamp;
	    public String comment;
	    public Integer create_by;
	    public String update_by;
	}

	public static class OrderInfo {
	    public ArrayList<OrderSingle> order_detail;
	    public ArrayList<OrderHistory> order_history;
	    public Integer order_age_day;
	    public Integer shipping_age_day;
	    public Integer delivered_age_day;
	    public Boolean partial_process;
	    public ShippingInfo shipping_info;
	    public Destination destination;
	    public Boolean is_replacement;
	    public Integer replacement_multiplier;
	}

	public static class OrderWarehouse {
	    public Integer warehouse_id;
	    public Integer fulfill_by;
	    public MetaData meta_data;
	}

	public static class OriginInfo{
	    public String sender_name;
	    public Integer origin_province;
	    public String origin_province_name;
	    public Integer origin_city;
	    public String origin_city_name;
	    public String origin_address;
	    public Integer origin_district;
	    public String origin_district_name;
	    public String origin_postal_code;
	    public String origin_geo;
	    public String receiver_name;
	    public String destination_address;
	    public Integer destination_province;
	    public Integer destination_city;
	    public Integer destination_district;
	    public String destination_postal_code;
	    public String destination_geo;
	    public DestinationLoc destination_loc;
	}

	public static class PaymentInfo{
	    public Integer payment_id;
	    public String payment_ref_num;
	    public String payment_date;
	    public Integer payment_method;
	    public String payment_status;
	    public Integer payment_status_id;
	    public String create_time;
	    public Integer pg_id;
	    public String gateway_name;
	    public Integer discount_amount;
	    public String voucher_code;
	    public Integer voucher_id;
	}

	public static class Preorder {
	    public Integer order_id;
	    public Integer preorder_type;
	    public Integer preorder_process_time;
	    public String preorder_process_start;
	    public String preorder_deadline;
	    public Integer shop_id;
	    public Integer customer_id;
	}

	public static class RecommendedCourierInfo {
	    public String name;
	    public Integer sequence;
	    public String milestone;
	}

	public static class ShipmentFulfillment {
	    public Integer id;
	    public Integer order_id;
	    public String payment_date_time;
	    public Boolean is_same_day;
	    public String accept_deadline;
	    public String confirm_shipping_deadline;
	    public ItemDeliveredDeadline item_delivered_deadline;
	    public Boolean is_accepted;
	    public Boolean is_confirm_shipping;
	    public Boolean is_item_delivered;
	    public Integer fulfillment_status;
	}

	public static class ShippingInfo {
	    public Integer sp_id;
	    public Integer shipping_id;
	    public String logistic_name;
	    public String logistic_service;
	    public Integer shipping_price;
	    public Integer shipping_price_rate;
	    public Integer shipping_fee;
	    public Double insurance_price;
	    public Double fee;
	    public Boolean is_change_courier;
	    public Integer second_sp_id;
	    public Integer second_shipping_id;
	    public String second_logistic_name;
	    public String second_logistic_service;
	    public Integer second_agency_fee;
	    public Integer second_insurance;
	    public Integer second_rate;
	    public String awb;
	    public Integer autoresi_cashless_status;
	    public String autoresi_awb;
	    public Integer autoresi_shipping_price;
	    public Integer count_awb;
	    public Boolean isCashless;
	    public Boolean is_fake_delivery;
	    public ArrayList<RecommendedCourierInfo> recommended_courier_info;
	}

	public static class ShopInfo {
	    public Integer shop_owner_id;
	    public String shop_owner_email;
	    public String shop_owner_phone;
	    public String shop_name;
	    public String shop_domain;
	    public Integer shop_id;
	}
	
}
