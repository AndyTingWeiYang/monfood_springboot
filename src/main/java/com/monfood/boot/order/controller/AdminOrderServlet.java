package com.monfood.boot.order.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monfood.boot.order.OrderVO;
import com.monfood.boot.order.service.OrderService;

@RestController
@RequestMapping(path = {"/AdminOrderServlet"})
public class AdminOrderServlet{

	@Autowired
	private OrderService orderService;
	
	@PostMapping
	public Map<String, Object> handlerMethod(@RequestBody OrderVO orderVO) {
		
		Map<String, Object> respObj = new HashMap<String, Object>();
		System.out.println(orderVO.getOrderId());
		final OrderVO result = orderService.adminFindOrderId(orderVO);
		if (result == null) {
			respObj.put("errMsg", "無此訂單");
			return respObj;
		}
		respObj.put("Orders", result);
		return respObj;
	}
}
