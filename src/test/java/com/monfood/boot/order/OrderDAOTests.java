package com.monfood.boot.order;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.monfood.boot.order.dao.OrderDAO;

@SpringBootTest
public class OrderDAOTests {
	
	@Autowired
	private OrderDAO orderDAO;
	
//	@Test
//	public void testGetOrderTimes() {
//		System.out.println(orderDAO.getOrderTimes(1));
//	}
//	
//	@Test
//	public void testInsert() {
//		OrderVO orderVO = new OrderVO();
//		orderVO.setUserId(1);
//		orderVO.setResId(2);
//		orderVO.setNote("11");
//		orderVO.setUserLocation("");
//		orderVO.setProductKcalTotal(123);
//		orderVO.setTotal(1111);
//		orderVO.setDelCost(1);
//		orderVO.setUseCash(true);
//		orderVO.setCreditId("111");
//		orderVO.setDiscount(123);
//		orderVO.setPromoteId(1);
//		System.out.println(orderDAO.insert(orderVO));
//	}
//	
//	@Test
//	public void testGetAll() {
//		List<OrderVO> list = orderDAO.getAll();
//		for (OrderVO vo : list) {
//			System.out.println(vo.getOrderId());
//		}
//		System.out.println(orderDAO.getAll());
//	}
//	
//	@Test
//	public void testInsertNoPromote() {
//		OrderVO orderVO = new OrderVO();
//		orderVO.setUserId(1);
//		orderVO.setResId(2);
//		orderVO.setNote("11");
//		orderVO.setUserLocation("");
//		orderVO.setProductKcalTotal(123);
//		orderVO.setTotal(1111);
//		orderVO.setDelCost(1);
//		orderVO.setUseCash(true);
//		orderVO.setCreditId("111");
//		orderVO.setDiscount(123);
//		System.out.println(orderDAO.insert(orderVO));
//	}
//	
//	@Test
//	public void testFindByPrimaryKey() {
//		System.out.println(orderDAO.findByPrimaryKey(1).getTotal());
//	}
//	
//	@Test
//	public void testUpdate() {
//		OrderVO orderVO = new OrderVO();
//		orderVO.setOrderId(92);
//		orderVO.setResRate(3.0);
//		orderVO.setDelRate(2.0);
//		orderVO.setDelComment("");
//		orderVO.setResComment("");
//		orderDAO.update(orderVO);
//		
//	}
//	
//	@Test
//	public void testUpdateDelId() {
//		OrderVO orderVO = new OrderVO();
//		orderVO.setOrderId(92);
//		orderVO.setDelId(3);
//		orderDAO.updateDelId(orderVO);
//	}
	
	@Test
	public void testGetAllById() {
		List<OrderVO> list= orderDAO.getAllById(1);
		for (OrderVO orderVO : list) {
			System.out.println(orderVO.getResVO().getResName());
		}
	}
	
	
	
}
