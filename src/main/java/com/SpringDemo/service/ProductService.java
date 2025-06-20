package com.SpringDemo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringDemo.model.Product;
import com.SpringDemo.repository.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	ProductRepo repo;
	
	public List<Product> getProducts(){
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
	

//	List<Product> products=new ArrayList<>(Arrays.asList(
//			new Product(101,"IPhone",50000),
//			new Product(102,"camera",70000),
//			new Product(103, "Airpods", 1200)));
//	
//	public List<Product> getProducts(){
//		return products;
//	}
//	
//	public Product getProductById(int prodId) {
//		return products.stream().filter(p ->p.getProdId()==prodId)
//				.findFirst().get();
//	}
//	
//	public void addProducts(Product prod) {
//		System.out.println(prod);
//		products.add(prod);
//	}
//	public void updateProduct(Product prod) {
//		int ind=0;
//		for(int i=0;i<products.size();i++) {
//			if(products.get(i).getProdId()==prod.getProdId()) {
//				ind=i;
//				break;
//			}
//		}
//		products.set(ind, prod);
//	}
//	public void deleteProduct(int prodId) {
//		int ind=0;
//		for(int i=0;i<products.size();i++) {
//			if(products.get(i).getProdId()==prodId) {
//				ind=i;
//				break;
//			}
//		}
//		products.remove(ind);
//	}
	
}
