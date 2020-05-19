package com.flipkartshop.shopapi.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.flipkartshop.shopapi.models.Bid;
import com.flipkartshop.shopapi.models.BidList;


@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	//exposed to client
	@RequestMapping("/products")
	public List<Product> getAllProduct(){
		return productService.getAllProduct();
	}
	
	@RequestMapping("/products/{id}")
	public Product getProduct(@PathVariable("id") Integer id) {
		return productService.getProduct(id);
	}
	
	@RequestMapping(value="/products",method=RequestMethod.POST)
	public Product postProduct(@RequestBody Product product) {
		return productService.postProduct(product);
	}
	
	@RequestMapping(value="/products/{id}",method=RequestMethod.PUT)
	public Product updateProduct(@PathVariable("id") Integer id,@RequestBody Product product) {
		return productService.updateProduct(id,product);
	}
	
	@RequestMapping(value="/products/{id}",method=RequestMethod.DELETE)
	public void deleteProduct(@PathVariable("id") Integer id) {
		productService.deleteProduct(id);
	}
	
	
	//exposed to client
	@RequestMapping("/products/{id}/bids")
	public List<Bid> getBids(@PathVariable("id") Integer id){
		return productService.getBids(id);
	}
	
	
	
	
	
	
}
