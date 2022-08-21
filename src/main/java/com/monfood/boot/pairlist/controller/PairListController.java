package com.monfood.boot.pairlist.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monfood.boot.pairlist.UserVOTemp;
import com.monfood.boot.pairlist.service.PairListService;

@RestController
public class PairListController {
	
	@Autowired
	private PairListService pairListService;
	
	// http://localhost:8080/monfood_springboot/FriendInfo
	@GetMapping("/FriendInfo")
	public List<UserVOTemp> FriendInfo(HttpSession session) {
//		Integer useraId = (Integer) session.getAttribute("userID");
		Integer useraId = 2;
		List<UserVOTemp> friendInfo = pairListService.findFriends(useraId);
		return friendInfo;
	}
	
	// http://localhost:8080/monfood_springboot/PairInfo
	@GetMapping("/PairInfo")
	public List<UserVOTemp> PairInfo(HttpSession session) {
//		Integer useraId = (Integer) session.getAttribute("userID");
		Integer useraId = 2;
		java.util.Date date = new java.util.Date();
		java.sql.Date today = new java.sql.Date(date.getTime());
		List<UserVOTemp> pairInfo = pairListService.findPairInfo(useraId, today);
		return pairInfo;
	}

}
