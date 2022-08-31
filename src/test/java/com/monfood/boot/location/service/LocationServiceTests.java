package com.monfood.boot.location.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.monfood.boot.location.LocationVO;

@SpringBootTest
public class LocationServiceTests {
	
	@Autowired
	private LocationService locationService;
	
	@Test
	public void testGetAllById() {
		System.out.println(locationService.getAllById(1));
	}
	
	@Test
	public void testInsert() {
		LocationVO vo = new LocationVO();
		vo.setUserId(1);
		vo.setLocation("123");
		locationService.insert(vo);
	}
}
