package com.SpringDemo.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Component
@Entity
public class Product {
	
	@Id
	private int prodId;
	private String prodname;
	private int price;
	public int getProdId() {
		return prodId;
	}
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdname() {
		return prodname;
	}
	public void setProdname(String prodname) {
		this.prodname = prodname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Product(int prodId, String prodname, int price) {
		super();
		this.prodId = prodId;
		this.prodname = prodname;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodname=" + prodname + ", price=" + price + "]";
	}
	
	
	

}
