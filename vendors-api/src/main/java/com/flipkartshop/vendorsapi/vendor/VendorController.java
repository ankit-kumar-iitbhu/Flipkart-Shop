package com.flipkartshop.vendorsapi.vendor;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class VendorController {
	
	@Autowired
	private VendorService vendorService;

	@RequestMapping("/vendors")
	public List<Vendor> getVendors(){
		return vendorService.getAllVendor();
	}
	
	@RequestMapping("/vendors/{id}")
	public Vendor getVendor(@PathVariable("id") int id) {
		return vendorService.getVendor(id);
	}
	
	@RequestMapping(value="/vendors",method=RequestMethod.POST)
	public Vendor addVendor(@RequestBody Vendor temp) {
		vendorService.addVendor(temp);
		return temp;
	}
	
	@RequestMapping(value="/vendors/{id}",method=RequestMethod.PUT)
	public void updateVendor(@RequestBody Vendor temp,@PathVariable("id") int id){
		vendorService.updateVendor(temp,id);

	}
	
	@RequestMapping(value="/vendors/{id}",method=RequestMethod.DELETE)
	public void removeVendor(@PathVariable("id") int id){
		vendorService.removeVendor(id);
	}
	
	
}
