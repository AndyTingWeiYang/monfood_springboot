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
@RequestMapping(path = {"/UpdateDelId"})
public class UpdateDelId{
       
	@Autowired
	private OrderService orderService;
	
	@PostMapping
	public Map<String, Object> handlerMethod(@RequestBody OrderVO orderVO) {

		Map<String, Object> respObj = new HashMap<String, Object>();
		final Integer result = orderService.updateDelId(orderVO);
		
		if (result < 0) {
			respObj.put("errMsg", "新增失敗");
			return respObj;
		}
		
		respObj.put("msg", "更新成功");
		return respObj;
	}
}
