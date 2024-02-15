package com.siah.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siah.curso.entities.OrderItem;
import com.siah.curso.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
