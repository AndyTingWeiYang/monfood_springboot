package com.monfood.boot.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.monfood.boot.product.dao.ProductDao;

@SpringBootTest
public class ProductDAOTests {
	
	@Autowired
	private ProductDao productDao;
	
	@Test
	public void testFindPic() {
		System.out.println(productDao.findPic(1).getProductName());
	}
	
	@Test
	public void testUpdateStats() {
		ProductVo vo = new ProductVo();
		vo.setProductID(1);
		vo.setProductStatus(2);
		System.out.println(productDao.updateStatus(vo));
	}
	
	@Test
	public void testUpdateStock() {
		ProductVo productVo = new ProductVo();
		productVo.setProductID(1);
		productVo.setStock(100);
		System.out.println(productDao.updateStock(productVo));
	}
}
