package com.rithik.simpleWebApp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rithik.simpleWebApp.model.Product;
import com.rithik.simpleWebApp.repository.ProductRepo;

@Service
public class ProductService {

	@Autowired
	ProductRepo repo;
	
	
	/*List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(77, "Iphone", 77777),
            new Product(18, "Oppo", 181818),
            new Product(33, "Realme", 333333)
    ));*/ 
	


    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product prod) {
        repo.save(prod);  
    }

	public void updateProduct(Product prod) {
		repo.save(prod);
		
	}

	public void deleteProduct(int prodId) {
		repo.deleteById(prodId);
	}
}
