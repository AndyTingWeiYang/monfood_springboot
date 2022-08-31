package com.monfood.boot.orderdetail.service;

import org.springframework.transaction.annotation.Transactional;

import com.monfood.boot.orderdetail.OrderDetailVO;

@Transactional
public interface OrderDetailService {
	
	Integer createOrderDetail(OrderDetailVO orderDetailVO);
}
