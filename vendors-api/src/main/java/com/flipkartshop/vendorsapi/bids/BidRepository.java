package com.flipkartshop.vendorsapi.bids;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BidRepository extends MongoRepository<Bid,Integer>{
	List<Bid> findByVendorVid(Integer vid);
	List<Bid> findByProductId(Integer pid);
	
}
