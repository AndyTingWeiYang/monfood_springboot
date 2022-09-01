package com.monfood.boot.order.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monfood.boot.order.OrderVO;
import com.monfood.boot.order.service.OrderService;

@RestController
@RequestMapping(path = {"/AdminOrderAllServlet"})
public class AdminOrderAllServlet{
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping
	public Map<String, Object> handlerMethod() {
		Map<String, Object> respObj = new HashMap<String, Object>();
		List<OrderVO> list = orderService.adminFindOrderAll();
		respObj.put("Orders", list);
		return respObj;
	}
	
}