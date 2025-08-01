package com.SpringDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringDemo.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
