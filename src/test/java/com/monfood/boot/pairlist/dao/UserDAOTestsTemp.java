package com.monfood.boot.pairlist.dao;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.monfood.boot.pairlist.UserVOTemp;

@SpringBootTest
public class UserDAOTestsTemp {
	
	@Autowired
	private UserDAOTemp userDAO;
	
	//ok
	@Test
	public void testSelect() {
		UserVOTemp result = userDAO.selectByUserId(1);
		System.out.println("result=" +result);
		
	}
	
	//ok
	@Test
	public void testGetAllId() {
		List result = userDAO.getAllUserId();
		System.out.println("result2=" +  result);
	}

}
