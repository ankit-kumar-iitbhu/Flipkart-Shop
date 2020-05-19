package com.flipkartshop.vendorsapi.vendor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendorService {
	
	@Autowired
	private VendorRepository vendorRepository;
	
	
	public List<Vendor> getAllVendor() {
		List<Vendor> vendors = new ArrayList<>();
		vendorRepository.findAll().forEach(vendors::add);
		return vendors;
	}
	
	public Vendor getVendor(int id) {
		return vendorRepository.findById(id).orElse(null);
	}
	
	public void addVendor(Vendor vendor) {
		vendorRepository.save(vendor);
	}
	
	public void updateVendor(Vendor vendor,int id) {
		vendorRepository.save(vendor);
	}
	public void removeVendor(int id) {
		vendorRepository.deleteById(id);
	}
	
	
}
