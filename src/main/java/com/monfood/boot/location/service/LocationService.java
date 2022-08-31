package com.monfood.boot.location.service;

import java.util.List;

import com.monfood.boot.location.LocationVO;

public interface LocationService {

	List<LocationVO> getAllById(Integer userId);

	void insert(LocationVO locationVO);

}