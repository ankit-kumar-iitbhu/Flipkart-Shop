package com.flipkartshop.vendorsapi.bids;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BidService {
	
	@Autowired
	private BidRepository bidRepository;
	
	
	public List<Bid> getAllBids() {
		List<Bid> Bids = new ArrayList<>();
		bidRepository.findAll().forEach(Bids::add);
		return Bids;
	}
	
	public List<Bid> getAllBidsOfProduct(Integer pid) {
		List<Bid> Bids = new ArrayList<>();
		bidRepository.findByProductId(pid).forEach(Bids::add);
		return Bids;
	}
	
	public List<Bid> getAllBidsOfVendor(Integer vid) {
		List<Bid> Bids = new ArrayList<>();
		bidRepository.findByVendorVid(vid).forEach(Bids::add);
		return Bids;
	}
	
	public Bid getBid(Integer id) {
		return bidRepository.findById(id).orElse(null);
	}
	
	public void addBid(Bid bid) {
		bidRepository.save(bid);
	}
	
	public void updateBid(Bid Bid,int id) {
		bidRepository.save(Bid);
	}
	
	public void removeBid(int id) {
		bidRepository.deleteById(id);
	}
	
	
}
