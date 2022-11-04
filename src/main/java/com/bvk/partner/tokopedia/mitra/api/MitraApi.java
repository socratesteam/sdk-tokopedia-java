package com.bvk.partner.tokopedia.mitra.api;

import com.bvk.partner.tokopedia.Tokopedia;

public class MitraApi extends Tokopedia.Api {

	private final Tokopedia tokopedia;
	protected MitraApi(Tokopedia tokopedia) {
		super(tokopedia);
		this.tokopedia = tokopedia;
	}
	
	private ProductApi productApi;
	public ProductApi getProductApi() {
		if (productApi == null) {
			productApi = new ProductApi(tokopedia);
		}
		return productApi;
	}
	
	private OrderApi orderApi;
	public OrderApi getOrderApi() {
		if (orderApi == null) {
			orderApi = new OrderApi(tokopedia);
		}
		return orderApi;
	}
	
	private DeliveryApi deliveryApi;
	public DeliveryApi getDeliveryApi() {
		if (deliveryApi == null) {
			deliveryApi = new DeliveryApi(tokopedia);
		}
		return deliveryApi;
	}
	
	private POMonitoringApi poMonitoringApi;
	public POMonitoringApi getPOMonitoringApi() {
		if (poMonitoringApi == null) {
			poMonitoringApi = new POMonitoringApi(tokopedia);
		}
		return poMonitoringApi;
	}

}
