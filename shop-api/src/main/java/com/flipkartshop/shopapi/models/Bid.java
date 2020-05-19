package com.flipkartshop.shopapi.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Bid {
	
	private Integer bidId;
	private Double price;
	private Integer productId;
	private Vendor vendor;
	

	public Bid() {
		super();
	}
	
	public Bid(Integer bidId, Double price, Integer productId) {
		super();
		this.bidId = bidId;
		this.price = price;
		this.productId = productId;
	}
	
	public Integer getBidId() {
		return bidId;
	}


	public void setBidId(Integer bid) {
		this.bidId = bid;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public Integer getProductId() {
		return productId;
	}


	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	
	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}



}
