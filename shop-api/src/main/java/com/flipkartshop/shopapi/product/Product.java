package com.flipkartshop.shopapi.product;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Product {
	
	@Id
	private Integer productId;
	private String productName;
	private String productDescription;
	
	public Product() {
		super();
	}
	
	public Product(Integer productId, String productName, String productDescription) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
	}
	
	public Integer getProductId() {
		return productId;
	}
	
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public String getProductDescription() {
		return productDescription;
	}
	
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	
}
