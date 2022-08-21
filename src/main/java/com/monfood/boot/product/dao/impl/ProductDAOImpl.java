package com.monfood.boot.product.dao.impl;

import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.monfood.boot.product.ProductVo;
import com.monfood.boot.product.dao.ProductDao;

@Repository
public class ProductDAOImpl implements ProductDao {
	
	@PersistenceContext
	private Session session;
	
	public Session getSession() {
		return this.session;
	}
	
	@Override
	public ProductVo findPic(Integer productId) {

		if (productId != null) {
			return this.getSession().get(ProductVo.class, productId);
		}
		
		return null;
	}
	
	
	@Override
	public boolean updateStock(ProductVo productVo) {
		
		final Integer productId = productVo.getProductID();
		
		if (productId != null && productVo != null) {
			ProductVo temp = this.getSession().get(ProductVo.class, productId);
			if (temp != null) {
				this.getSession().createQuery("UPDATE ProductVo SET stock = :stock WHERE productID = :productId ")
				.setParameter("stock", productVo.getStock())
				.setParameter("productId", productId).executeUpdate();
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	public boolean updateStatus(ProductVo productVo) {

		final Integer productId = productVo.getProductID();
		
		if (productId != null && productVo != null) {
			ProductVo temp = this.getSession().get(ProductVo.class, productId);
			if (temp != null) {
				this.getSession().createQuery("UPDATE ProductVo SET productStatus = :productStatus WHERE productID = :productId ")
									.setParameter("productStatus", productVo.getProductStatus())
									.setParameter("productId", productId).executeUpdate();
				return true;
			}
		}
		
		return false;
		
	
	}

	
	
}