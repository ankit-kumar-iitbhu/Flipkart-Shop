package com.flipkartshop.vendorsapi.vendor;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Vendor {
	
	@Id
	private Integer vid;
	private String name;
	private String contactDetail;
	
	
	public Vendor() {
		super();
	}

	public Vendor(int vid, String name, String contactDetail) {
		super();
		this.vid = vid;
		this.name = name;
		this.contactDetail = contactDetail;
	}
	
	
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactDetail() {
		return contactDetail;
	}
	public void setContactDetail(String contactDetail) {
		this.contactDetail = contactDetail;
	}

	

}
