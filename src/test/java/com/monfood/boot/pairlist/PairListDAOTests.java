package com.monfood.boot.pairlist;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.monfood.boot.pairlist.dao.PairListDAO;

@SpringBootTest
public class PairListDAOTests {
	
	@Autowired
	private PairListDAO pairListDAO;
	
	@Test
	void contextLoads() {
	}
	
	//ok
	@Test
	public void testInsert(){
		PairListVO pairListVO = new PairListVO();
		pairListVO.setPairId(1);
		pairListVO.setUseraId(3);
		pairListVO.setUserbId(2);
		java.util.Date today = new java.util.Date();
		java.sql.Date pairedDate = new java.sql.Date(today.getTime());
		pairListVO.setPairedDate(pairedDate);
		boolean result = pairListDAO.insert(pairListVO);
		System.out.println("result=" + result);
	}
	
	//[to be revised]
	@Test
	public void testUpdate() {
		PairListVO update = new PairListVO();
		update.setUseraAnswer(1);
		update.setUseraId(3);
		java.util.Date date = new java.util.Date();
		java.sql.Date today = new java.sql.Date(date.getTime());
		update.setPairedDate(today);
		pairListDAO.updateUseraAnswer(update);
		System.out.println("update=" + update);
	}
	
	//ok
	@Test
	public void testSelect() {
		List<PairListVO> select = pairListDAO.selectByIdAndStatus(1);
		System.out.println("select = "+select);
	}
	

}
