package com.monfood.boot.location.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.monfood.boot.location.LocationVO;
import com.monfood.boot.location.dao.LocationDAO;
import com.monfood.boot.location.service.LocationService;

@Service
@Transactional
public class LocationServiceImpl implements LocationService{
	
	@Autowired
	private LocationDAO dao;
	
	@Override
	public List<LocationVO> getAllById(Integer userId){
		List<LocationVO> list = dao.findByPrimaryKey(userId);
		return list;
	}
	
	@Override
	public void insert(LocationVO locationVO){
		dao.insert(locationVO);
	}
}
