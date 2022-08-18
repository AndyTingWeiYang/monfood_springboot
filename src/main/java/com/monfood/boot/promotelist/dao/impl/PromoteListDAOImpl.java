package com.monfood.boot.promotelist.dao.impl;

import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.monfood.boot.promotelist.PromoteListVO;
import com.monfood.boot.promotelist.dao.PromoteListDAO;

@Repository
public class PromoteListDAOImpl implements PromoteListDAO {

	@PersistenceContext
	private Session session;
	
	public Session getSession() {
		return this.session;
	}
	
	@Override
	public PromoteListVO findByPrimaryKey(Integer promoteId) {
		if (promoteId != null) {
			return this.getSession().get(PromoteListVO.class, promoteId); 
		}
		return null;
	}



	@Override
	public PromoteListVO findByCode(String promoteCode) {
		if (promoteCode != null) {
			return (PromoteListVO) this.getSession().createQuery("FROM PromoteListVO where promoteCode = :promoteCode")
										.setParameter("promoteCode", promoteCode).getSingleResult();
		}
		return null;
	}

}
