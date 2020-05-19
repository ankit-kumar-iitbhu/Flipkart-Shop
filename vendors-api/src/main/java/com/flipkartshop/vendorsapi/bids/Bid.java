package com.flipkartshop.vendorsapi.bids;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.flipkartshop.vendorsapi.vendor.Vendor;


@Document
public class Bid {
	

	@Id
	private Integer bidId;
	private Double price;
	private Integer productId;
	@DBRef
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
