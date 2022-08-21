package com.monfood.boot.promotelist.dao;

import java.util.List;
import java.util.Map;

import com.monfood.boot.promotelist.PromoteListVO;

public interface PromoteListDAO {

		PromoteListVO findByPrimaryKey(Integer promoteId);
		PromoteListVO findByCode(String promoteCode);
}
