package com.flipkartshop.shopapi.models;

import java.util.ArrayList;
import java.util.List;

public class BidList {
	private List<Bid> bidList;
	
	public List<Bid> getBidList() {
		return bidList;
	}

	public void setBidList(List<Bid> bidList) {
		this.bidList = bidList;
	}

	public BidList() {
		this.bidList=new ArrayList<>();
	}

}
