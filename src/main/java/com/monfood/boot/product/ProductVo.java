package com.monfood.boot.product;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Objects;

import javax.persistence.Table;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "PRODUCT")
public class ProductVo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "PRODUCT_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productID;
	
	@Column(name = "RES_ID")
	private Integer resID;
	
	@Column(name = "PRODUCT_STATUS")
	private Integer productStatus;
	
	@Column(name = "PRODUCT_PRICE")
	private Integer productPrice;
	
	@Column(name = "PRODUCT_KCAL")
	private Integer productKcal;
	
	@Column(name = "PRODUCT_NAME")
	private String productName;
	
	@Column(name = "STOCK")
	private Integer stock;
	
	@Column(name = "UPDATE_TIME")
	private java.sql.Timestamp updateTime;
	
	@Column(name = "PRODUCT_PIC")
	@Type(type="org.hibernate.type.ImageType")
	private byte[] productPic;

	public ProductVo() {

	}

	public ProductVo(Integer productID, Integer resID, Integer productStatus, Integer productPrice, Integer productKcal,
			String productName, Integer stock, Timestamp updateTime, byte[] productPic) {
		super();
		this.productID = productID;
		this.resID = resID;
		this.productStatus = productStatus;
		this.productPrice = productPrice;
		this.productKcal = productKcal;
		this.productName = productName;
		this.stock = stock;
		this.updateTime = updateTime;
		this.productPic = productPic;
	}

	public Integer getProductID() {
		return productID;
	}

	public void setProductID(Integer productID) {
		this.productID = productID;
	}

	public Integer getResID() {
		return resID;
	}

	public void setResID(Integer resID) {
		this.resID = resID;
	}

	public Integer getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(Integer productStatus) {
		this.productStatus = productStatus;
	}

	public Integer getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}

	public Integer getProductKcal() {
		return productKcal;
	}

	public void setProductKcal(Integer productKcal) {
		this.productKcal = productKcal;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public java.sql.Timestamp getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(java.sql.Timestamp updateTime) {
		this.updateTime = updateTime;
	}

	public byte[] getProductPic() {
		return productPic;
	}

	public void setProductPic(byte[] productPic) {
		this.productPic = productPic;
	}

	@Override
	public String toString() {
		return "ProductVo [productID=" + productID + ", resID=" + resID + ", productStatus=" + productStatus
				+ ", productPrice=" + productPrice + ", productKcal=" + productKcal + ", productName=" + productName
				+ ", stock=" + stock + ", updateTime=" + updateTime + ", productPic=" + Arrays.toString(productPic)
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(productID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductVo other = (ProductVo) obj;
		return Objects.equals(productID, other.productID);
	}
	
}
