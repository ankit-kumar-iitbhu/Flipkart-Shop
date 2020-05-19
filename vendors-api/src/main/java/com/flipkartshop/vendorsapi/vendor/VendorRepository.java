package com.flipkartshop.vendorsapi.vendor;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendorRepository extends MongoRepository<Vendor,Integer>{
	
}
