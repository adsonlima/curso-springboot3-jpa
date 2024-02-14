package com.siah.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siah.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
