package com.monfood.boot.pairlist.dao;

import java.util.List;

import com.monfood.boot.pairlist.UserVOTemp;

public interface UserDAOTemp {
	public UserVOTemp selectByUserId(Integer userId);
	List getAllUserId(); 
}
