package com.rithik.simpleWebApp.model;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Component
@Entity
public class Product {

	
	
	@JsonProperty("prodId")
	@Id
	private int prodId;
	@JsonProperty("prodName")
	private String prodName;
	@JsonProperty("price")
	private int price;
	
	public Product() {
		
	}
	public Product(int prodId, String prodName, int price) {
	
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
	}
	
	
	
	@Override
	public String toString() {
		return "Product {"+
					"prodId=" + prodId + 
					", prodName=" + prodName + 
					", price=" + price + 
					"}";
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
}
