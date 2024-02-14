package com.siah.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siah.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
