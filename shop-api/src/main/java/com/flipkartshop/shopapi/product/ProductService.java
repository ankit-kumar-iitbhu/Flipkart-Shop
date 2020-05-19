package com.flipkartshop.shopapi.product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.flipkartshop.shopapi.models.Bid;
import com.flipkartshop.shopapi.models.BidList;


@Service
public class ProductService {
	
	final static String vendorUri = "http://localhost:8090/bids/";
	
	@Autowired
	private ProductRepository productRepository;
	
	RestTemplate restTemplate=new RestTemplate();
	
	public List<Product> getAllProduct(){
		List<Product> products=new ArrayList<>();
		productRepository.findAll().forEach(products::add);
		return products;
	}
	
	public Product getProduct(Integer id) {
		return productRepository.findById(id).orElse(null);
	}
	
	public Product postProduct(Product product) {
		productRepository.save(product);
		return product;
	}
	
	public Product updateProduct(Integer id,Product product) {
		productRepository.save(product);
		return product;
	}
	
	public void deleteProduct(Integer id) {
		productRepository.deleteById(id);;
	}
	
	public List<Bid> getBids(Integer id){
		//BidList bids= restTemplate.getForObject(vendorUri+id,BidList.class);
		String resourceUri=vendorUri+id;
		System.out.println(resourceUri);
		ResponseEntity<List<Bid>> bidResponse =
		        restTemplate.exchange(resourceUri,
		                    HttpMethod.GET, null, new ParameterizedTypeReference<List<Bid>>() {
		            });
		List<Bid> bids = bidResponse.getBody();
		return bids;
	}
	
	
	
}
