package com.fooddelivery.fooddelivery.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fooddelivery.fooddelivery.dao.FoodDeliveryRepository;
import com.fooddelivery.fooddelivery.entity.Order;

@RestController
@RequestMapping("/fooddelivery")
public class FoodDeliverySystemController {

	@Autowired
	FoodDeliveryRepository foodDeliveryRepository;

	@PostMapping("/order")
	public Order createOrder(@RequestBody Order order) {
		foodDeliveryRepository.save(order);
		return order;
	}

	@GetMapping("/order")
	public List<Order> getOrder() {
		return foodDeliveryRepository.findAll();
	}

	@GetMapping("/order/{orderId}")
	public Optional<Order> getSingleOrder(@PathVariable int orderId) {
		return foodDeliveryRepository.findById(orderId);
	}

	@PutMapping("/order")
	public Order updateOrder(@RequestBody Order order) {
		foodDeliveryRepository.save(order);
		return order;
	}

	@DeleteMapping("/order")
	public String deleteOrder(@PathVariable int orderId) {
		foodDeliveryRepository.deleteById(orderId);
		return "The order with id" + orderId + "is deleted";
	}

}
