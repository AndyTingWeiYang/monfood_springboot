package com.monfood.boot.order.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.monfood.boot.order.OrderVO;
import com.monfood.boot.order.dao.OrderDAO;

@Repository
public class OrderDAOimpl implements OrderDAO {

	@PersistenceContext
	private Session session;
	
	public Session getSession() {
		return session;
	}

	@Override
	public Integer getOrderTimes(Integer userId) {
		if (userId != null) {
			Integer result = Integer.parseInt(this.getSession().createQuery("select count(*) from OrderVO where userId = :userId group by userId")
					 .setParameter("userId", userId).getSingleResult().toString());
			return result;
		}
		return null;
	}

	@Override
	public Integer insert(OrderVO orderVO) {
		
		if (orderVO != null) {
			Serializable pk = this.getSession().save(orderVO);
			return (Integer)pk;
		}
		return null;
	}

	@Override
	public Integer insertNoPromote(OrderVO orderVO) {
		
		if (orderVO != null) {
			Serializable pk = this.getSession().save(orderVO);
			return (Integer)pk;
		}
		return null;
	}

	@Override
	public List<OrderVO> getAll() {
		return (List<OrderVO>) this.getSession().createQuery("FROM OrderVO ORDER BY orderId", OrderVO.class).list();
	}

	@Override
	public OrderVO findByPrimaryKey(Integer orderId) {

		if (orderId != null) {
			return this.getSession().get(OrderVO.class, orderId);
		}
		return null;
	}

	@Override
	public void update(OrderVO orderVO) {
		final Integer orderId = orderVO.getOrderId();
		if (orderId != null && orderVO != null) {
			OrderVO temp = this.getSession().get(OrderVO.class, orderId);
			if (temp != null) {
				this.getSession().createQuery("UPDATE OrderVO SET resRate = :resRate, delRate = :delRate, resComment = :resComment, delComment = :delComment WHERE orderId = :orderId")
								 .setParameter("resRate", orderVO.getResRate())
								 .setParameter("delRate", orderVO.getDelRate())
								 .setParameter("resComment", orderVO.getResComment())
								 .setParameter("delComment", orderVO.getDelComment())
								 .setParameter("orderId", orderVO.getOrderId())
								 .executeUpdate();
			}
		}
	}
	
	@Override
	public void updateDelId(OrderVO orderVO) {
		final Integer orderId = orderVO.getOrderId();
		System.out.println(orderId);
		System.out.println(orderVO.getDel().getDelid());
		if (orderId != null && orderVO != null) {
			OrderVO temp = this.getSession().get(OrderVO.class, orderId);
			if (temp != null) {
				this.getSession().createQuery("UPDATE OrderVO SET DEL_ID = :delId WHERE orderId = :orderId")
								 .setParameter("delId", orderVO.getDel().getDelid())
								 .setParameter("orderId", orderVO.getOrderId())
								 .executeUpdate();
			}
		}
	}

	@Override
	public List<OrderVO> getAllById(Integer userId) {
		if (userId != null) {
			return this.getSession().createQuery("SELECT o FROM OrderVO o inner join o.resVO where o.userId = :userId", OrderVO.class)
									.setParameter("userId", userId)
									.list();
		}
		return null;

	}

	@Override
	public List<OrderVO> getAllProductById(Integer userId) {
		if (userId != null) {
			return this.getSession().createQuery("SELECT o FROM OrderVO o join fetch o.orderDetailVO od join fetch od.productVo p where o.userId = :userId", OrderVO.class)
									.setParameter("userId", userId)
									.list();
		}
		return null;
		
	}


}
