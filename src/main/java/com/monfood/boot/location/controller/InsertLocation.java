package com.monfood.boot.location.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monfood.boot.location.LocationVO;
import com.monfood.boot.location.service.LocationService;

@RestController
@RequestMapping(path = {"/InsertLocation"})
public class InsertLocation{
    
	@Autowired
	private LocationService locationService;
	
	@PostMapping
	public Map<String, Object> handlerMethod(HttpSession session, LocationVO locationVO) {
		
		Map<String, Object> respObj = new HashMap<String, Object>();
		final Integer userId = (Integer)session.getAttribute("userID");
		if (userId == null) {
			respObj.put("errMsg", "無登入");
			return respObj;
		}
		locationVO.setUserId(userId);
		locationService.insert(locationVO);
		respObj.put("msg", "success");
		
		return respObj;
	}
	
}
