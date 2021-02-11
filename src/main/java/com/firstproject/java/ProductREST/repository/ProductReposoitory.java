package com.firstproject.java.ProductREST.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstproject.java.ProductREST.product.Product;

public interface ProductReposoitory extends JpaRepository<Product, Integer>{

}
