package com.monfood.boot.product.dao;

import org.springframework.transaction.annotation.Transactional;

import com.monfood.boot.product.ProductVo;

public interface ProductDao {
	
	@Transactional
	boolean updateStock(ProductVo productVo);
	@Transactional
	boolean updateStatus(ProductVo productVo);
	@Transactional
	ProductVo findPic(Integer productId);

}
