package com.monfood.boot.orderdetail.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.monfood.boot.orderdetail.OrderDetailVO;
import com.monfood.boot.orderdetail.dao.OrderDetailDAO;
import com.monfood.boot.orderdetail.service.OrderDetailService;
import com.monfood.boot.product.ProductVo;
import com.monfood.boot.product.dao.ProductDao;
import com.monfood.boot.product.dao.impl.ProductDAOImpl;

@Service
@Transactional
public class OrderDetailServiceimpl implements OrderDetailService{
	
	@Autowired
	private OrderDetailDAO dao;
	@Autowired
	private ProductDao productDao;
	
	@Override
	synchronized public Integer createOrderDetail(OrderDetailVO orderDetailVO) {
		
		Integer stock = null;
		Integer orderQty = orderDetailVO.getAmount();
		Integer balance = null;
		ProductVo productVo = new ProductVo();
		
		// get product vo by product id
		productVo = productDao.findPic(orderDetailVO.getProductVo().getProductID());
		// get stock
		stock = productVo.getStock();
		balance = stock - orderQty;
		// reset stock
		productVo.setStock(balance);
		productDao.updateStock(productVo);
		// create order detail
		dao.insert(orderDetailVO);
		return 1;
	}
}
