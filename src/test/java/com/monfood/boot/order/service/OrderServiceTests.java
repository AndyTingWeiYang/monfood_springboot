package com.monfood.boot.order.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.monfood.boot.del.DelBean;
import com.monfood.boot.order.OrderVO;
import com.monfood.boot.promotelist.PromoteListVO;

@SpringBootTest
public class OrderServiceTests {
	
	@Autowired
	private OrderService orderService;
	
	@Test
	public void testAdminFindOrderId() {
		OrderVO orderVO = new OrderVO();
		orderVO.setOrderId(1);
		orderVO = orderService.adminFindOrderId(orderVO);
		System.out.println(orderVO.getTotal());
	}
	
	@Test
	public void testAdminFindOrderAll() {
		System.out.println(orderService.adminFindOrderAll());
	}
	
	@Test
	public void testGetAllForUser() {
		System.out.println(orderService.getAllForUser(1));
	}
	
	@Test
	public void testGetAllProductUser() {
		System.out.println(orderService.getAllProductUser(1));
	}
	
	@Test
	public void testPromoteCheck() {
		PromoteListVO promoteListVO = new PromoteListVO();
		promoteListVO.setPromoteCode("新年一月");
		System.out.println(orderService.promoteCheck(promoteListVO).getPromotePrice());
	}
	
	@Test
	public void testOrderTimes() {
		System.out.println(orderService.orderTimes(1));
	}
	
	@Test
	public void testUpdateRating() {
		OrderVO orderVO = new OrderVO();
		orderVO.setOrderId(244);
		orderVO.setDelRate(5.0);
		orderVO.setResRate(5.0);
		orderVO.setResComment("");
		orderVO.setDelComment("");
		
		System.out.println(orderService.updateRating(orderVO));
	}
	
	@Test
	public void testUpdateDelId() {
		OrderVO orderVO = new OrderVO();
		DelBean delBean = new DelBean();
		delBean.setDelid(1);
		
		orderVO.setOrderId(244);
		orderVO.setDel(delBean);
		
		System.out.println(orderService.updateDelId(orderVO));
	}
	
}
