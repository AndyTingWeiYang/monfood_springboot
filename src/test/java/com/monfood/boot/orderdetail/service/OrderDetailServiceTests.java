package com.monfood.boot.orderdetail.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.monfood.boot.order.OrderVO;
import com.monfood.boot.orderdetail.OrderDetailVO;
import com.monfood.boot.product.ProductVo;

@SpringBootTest
public class OrderDetailServiceTests {
	
	@Autowired
	private OrderDetailService orderDetailService;
	
	@Test
	public void testCreateOrderDetail() {
		ProductVo productVo = new ProductVo();
		productVo.setProductID(24);
		OrderVO orderVO = new OrderVO();
		orderVO.setOrderId(244);
		OrderDetailVO orderDetailVO = new OrderDetailVO();
		orderDetailVO.setProductVo(productVo);
		orderDetailVO.setOrderVO(orderVO);
		orderDetailVO.setAmount(1);
		orderDetailVO.setOrderedPrice(10);
		System.out.println(orderDetailService.createOrderDetail(orderDetailVO));
	}
}
