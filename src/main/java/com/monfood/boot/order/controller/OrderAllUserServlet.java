package com.monfood.boot.order.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monfood.boot.order.OrderVO;
import com.monfood.boot.order.service.OrderService;

@RestController
@RequestMapping(path = {"/OrderAllUserServlet"})
public class OrderAllUserServlet{
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping
	public Map<String, Object> handlerMethod(@RequestBody OrderVO orderVO, HttpSession session) {
		
		Map<String, Object> respObj = new HashMap<String, Object>();
		final Integer userId = (Integer) session.getAttribute("userID");
		
		if (userId == null) {
			respObj.put("errMsg", "無登入");
			return respObj;
		}else if (orderVO == null) {
			respObj.put("errMsg", "系統錯誤");
			return respObj;
		}else {
			orderVO.setUserId(userId);
			List<OrderVO> list = orderService.getAllForUser(orderVO.getUserId());
			List<OrderVO> productList = orderService.getAllProductUser(orderVO.getUserId());
			respObj.put("userOrders", list);
			respObj.put("orderDetail", productList);
			return respObj;
		}
		
	}

}