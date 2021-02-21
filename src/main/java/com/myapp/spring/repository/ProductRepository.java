package com.myapp.spring.repository;

import com.myapp.spring.model.Product;

import java.util.List;

public interface ProductRepository {
	
	Product saveProduct(Product product);
	
	Product upadateProduct(Product product);
	
	List<Product> findAll();
	
	void delete(Integer productId);
	
	Product findById(Integer id);

}
