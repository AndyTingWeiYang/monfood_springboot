package com.monfood.boot.order.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monfood.boot.order.service.OrderService;
import com.monfood.boot.promotelist.PromoteListVO;

@RestController
@RequestMapping(path = {"/PromoteCheckServlet"})
public class PromoteCheckServlet{
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping
	public Map<String, Object> handlerMethod(@RequestBody PromoteListVO promoteListVO) {
		Map<String, Object> respObj = new HashMap<String, Object>();
		final PromoteListVO result = orderService.promoteCheck(promoteListVO);
		
		if (result == null) {
			respObj.put("errMsg", "無此優惠代碼");
			return respObj;
		}
		
		respObj.put("promoteCode", result);
		return respObj;
	}
}
