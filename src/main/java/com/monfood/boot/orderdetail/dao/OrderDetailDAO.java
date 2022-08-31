package com.monfood.boot.orderdetail.dao;

import org.springframework.transaction.annotation.Transactional;

import com.monfood.boot.orderdetail.OrderDetailVO;

public interface OrderDetailDAO {
	boolean insert(OrderDetailVO orderDetailVO);
}