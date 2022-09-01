package com.monfood.boot.location.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monfood.boot.location.LocationVO;
import com.monfood.boot.location.service.LocationService;

@RestController
@RequestMapping(path = {"/GetAllLocation"})
public class GetAllLocation{
    
	@Autowired
	private LocationService locationService;
	
	@PostMapping
	public Map<String, Object> handlerMethod(HttpSession session) {
		
		Map<String, Object> respObj = new HashMap<String, Object>();
		final Integer userId = (Integer)session.getAttribute("userID");
		if (userId == null) {
			respObj.put("errMsg", "無登入");
			return respObj;
		}
		
		List<LocationVO> list = locationService.getAllById(userId);
		respObj.put("locations", list);
		return respObj;
	}
	
}
