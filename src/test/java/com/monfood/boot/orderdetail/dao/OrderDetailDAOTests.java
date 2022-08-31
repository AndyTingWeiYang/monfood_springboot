package com.monfood.boot.orderdetail.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.monfood.boot.order.OrderVO;
import com.monfood.boot.orderdetail.OrderDetailVO;
import com.monfood.boot.orderdetail.dao.OrderDetailDAO;
import com.monfood.boot.product.ProductVo;

@SpringBootTest
public class OrderDetailDAOTests {

	@Autowired
	private OrderDetailDAO orderDetailDAO;
	
	@Test
	public void testInsert() {
		ProductVo productVo = new ProductVo();
		productVo.setProductID(23);
		OrderVO orderVO = new OrderVO();
		orderVO.setOrderId(201);
		OrderDetailVO orderDetailVO = new OrderDetailVO();
		orderDetailVO.setProductVo(productVo);
		orderDetailVO.setOrderVO(orderVO);
		orderDetailVO.setAmount(1);
		orderDetailVO.setOrderedPrice(10);
		boolean result = orderDetailDAO.insert(orderDetailVO);
		System.out.println(result);
	}
	
}
