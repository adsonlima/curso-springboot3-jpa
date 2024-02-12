package com.siah.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siah.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
