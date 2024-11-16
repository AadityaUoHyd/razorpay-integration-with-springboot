package org.aadi.razorpay_springboot_integration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.aadi.razorpay_springboot_integration.model.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Integer>{

	Orders findByRazorpayOrderId(String razorpayId);

}
