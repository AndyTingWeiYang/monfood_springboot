package com.monfood.boot.order.dao;

import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import com.monfood.boot.order.OrderVO;

public interface OrderDAO {

	Integer insert(OrderVO orderVO);

	List<OrderVO> getAll();

	OrderVO findByPrimaryKey(Integer orderId);
	
	@Transactional
	void update(OrderVO orderVO);

	Integer insertNoPromote(OrderVO orderVO);

	Integer getOrderTimes(Integer userId);

	List<OrderVO> getAllById(Integer userId);

	List<OrderVO> getAllProductById(Integer userId);
	
	@Transactional
	void updateDelId(OrderVO orderVO);

}