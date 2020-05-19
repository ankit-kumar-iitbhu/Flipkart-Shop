package com.flipkartshop.vendorsapi.bids;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flipkartshop.vendorsapi.vendor.Vendor;
import com.flipkartshop.vendorsapi.vendor.VendorService;

import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class BidController {
	
	
	@Autowired
	private BidService bidService;
	@Autowired
	private VendorService vendorService;
	
	
	@RequestMapping("/vendors/{vid}/bids")
	public List<Bid> getBids(@PathVariable("vid") Integer vid){
		return bidService.getAllBidsOfVendor(vid);
	}
	
	@RequestMapping("/vendors/{vid}/bids/{bidId}")
	public Bid getBid(@PathVariable("bidId") Integer id) {
		return bidService.getBid(id);
	}
	
	@RequestMapping(value="/vendors/{vid}/bids",method=RequestMethod.POST)
	public Bid addBid(@RequestBody Bid temp,@PathVariable("vid") Integer vid) {
		Vendor vendor=vendorService.getVendor(vid);
		temp.setVendor(vendor);
		bidService.addBid(temp);
		return temp;
	}
	
	@RequestMapping(value="/vendors/{vid}/bids/{id}",method=RequestMethod.PUT)
	public void updateBid(@RequestBody Bid temp,@PathVariable("vid") Integer vid,@PathVariable("id") Integer bidId){
		Vendor vendor=vendorService.getVendor(vid);
		temp.setVendor(vendor);		
		bidService.updateBid(temp,bidId);
	
	}
	
	@RequestMapping(value="/vendors/{vid}/bids/{id}",method=RequestMethod.DELETE)
	public void removeBid(@PathVariable("id") Integer id){
		bidService.removeBid(id);
	}
	
	@RequestMapping(value="/bids")
	public List<Bid> getAllBids() {
		return bidService.getAllBids();
	}
	
	@RequestMapping(value="/bids/{pid}")
	public List<Bid> getAllBidsOfProduct(@PathVariable("pid") Integer pid){
		return bidService.getAllBidsOfProduct(pid);
	}
	
}
