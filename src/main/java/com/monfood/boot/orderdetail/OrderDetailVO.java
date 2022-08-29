package com.monfood.boot.orderdetail;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.monfood.boot.order.OrderVO;
import com.monfood.boot.product.ProductVo;

@Entity
@Table(name = "ORDER_DETAIL")
public class OrderDetailVO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@ManyToOne
	@JoinColumn(
			name = "PRODUCT_ID",
			referencedColumnName = "PRODUCT_ID"
	)
	private ProductVo productVo;
	
	@Id
	@ManyToOne
	@JoinColumn(
			name = "ORDER_ID",
			referencedColumnName = "ORDER_ID"
	)
	private OrderVO orderVO;
	
	@Column(name = "AMOUNT")
	private Integer amount;
	
	@Column(name = "ORDERED_PRICE")
	private Integer orderedPrice;
	
	public OrderDetailVO() {
	}

	public OrderDetailVO(ProductVo productVo, OrderVO orderVO, Integer amount, Integer orderedPrice) {
		super();
		this.productVo = productVo;
		this.orderVO = orderVO;
		this.amount = amount;
		this.orderedPrice = orderedPrice;
	}

	public ProductVo getProductVo() {
		return productVo;
	}

	public void setProductVo(ProductVo productVo) {
		this.productVo = productVo;
	}

	public OrderVO getOrderVO() {
		return orderVO;
	}

	public void setOrderVO(OrderVO orderVO) {
		this.orderVO = orderVO;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Integer getOrderedPrice() {
		return orderedPrice;
	}

	public void setOrderedPrice(Integer orderedPrice) {
		this.orderedPrice = orderedPrice;
	}

	@Override
	public int hashCode() {
		return Objects.hash(orderVO, productVo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderDetailVO other = (OrderDetailVO) obj;
		return Objects.equals(orderVO, other.orderVO) && Objects.equals(productVo, other.productVo);
	}
	
}