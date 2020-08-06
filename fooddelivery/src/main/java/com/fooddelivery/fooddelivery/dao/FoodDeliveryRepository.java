package com.fooddelivery.fooddelivery.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fooddelivery.fooddelivery.entity.Order;

public interface FoodDeliveryRepository extends JpaRepository<Order, Integer> {

}
