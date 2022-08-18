package com.monfood.boot.promotelist;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.monfood.boot.promotelist.dao.PromoteListDAO;

@SpringBootTest
public class PromoteListDAOTests {
	
	@Autowired
	private PromoteListDAO promoteListDAO;
	
	@Test
	public void testFindByPrimaryKey() {
		System.out.println(promoteListDAO.findByPrimaryKey(1).getPromoteCode());
	}
	
	@Test
	public void testFindByCode() {
		System.out.println(promoteListDAO.findByCode("新年一月").getPromotePrice());
	}
}
