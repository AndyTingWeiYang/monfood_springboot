package com.monfood.boot.order;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.monfood.boot.del.DelBean;
import com.monfood.boot.orderdetail.OrderDetailVO;
import com.monfood.boot.res.ResVO;

@Entity
@Table(name = "`ORDER`")
public class OrderVO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ORDER_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderId;
	
	@Column(name = "USER_ID")
	private Integer userId;
	
	@Column(name = "ORDER_STATUS", insertable = false)
	private Integer orderStatus;
	
	@Column(name = "NOTE")
	private String note;
	
	@Column(name = "USER_LOCATION")
	private String userLocation;
	
	@Column(name = "ORDER_CREATE", insertable = false)
	private Timestamp orderCreate;
	
	@Column(name = "ORDER_DONE", insertable = false)
	private Timestamp orderDone;
	
	@Column(name = "PRODUCT_KCAL_TOTAL")
	private Integer productKcalTotal;
	
	@Column(name = "TOTAL")
	private Integer total;
	
	@Column(name = "DEL_COST")
	private Integer delCost;
	
	@Column(name = "USE_CASH")
	private Boolean useCash;
	
	@Column(name = "CREDIT_ID")
	private String creditId;
	
	@Column(name = "DISCOUNT")
	private Integer discount;
	
	@Column(name = "RATING", insertable = false)
	private Boolean rating;
	
	@Column(name = "RES_RATE", nullable = true)
	private Double resRate;
	
	@Column(name = "DEL_RATE", nullable = true)
	private Double delRate;
	
	@Column(name = "RES_COMMENT", nullable = true)
	private String resComment;
	
	@Column(name = "DEL_COMMENT", nullable = true)
	private String delComment;
	
	@Column(name = "PROMOTE_ID", nullable = true)
	private Integer promoteId;
	
	@OneToMany(
			mappedBy = "orderVO",
			cascade = {CascadeType.REMOVE} 
	)
	private Set<OrderDetailVO> orderDetailVO;
	
	@ManyToOne
	@JoinColumn(
			name = "RES_ID",
			referencedColumnName = "RES_ID"
	)
	private ResVO resVO;
	
	@ManyToOne
	@JoinColumn(
			name = "DEL_ID",
			referencedColumnName = "DEL_ID"
	)
	private DelBean del;
	
	public OrderVO() {
	}

	public OrderVO(Integer orderId, Integer userId, Integer orderStatus, String note, String userLocation,
			Timestamp orderCreate, Timestamp orderDone, Integer productKcalTotal, Integer total, Integer delCost,
			Boolean useCash, String creditId, Integer discount, Boolean rating, Double resRate, Double delRate,
			String resComment, String delComment, Integer promoteId, Set<OrderDetailVO> orderDetailVO, ResVO resVO,
			DelBean del) {
		this.orderId = orderId;
		this.userId = userId;
		this.orderStatus = orderStatus;
		this.note = note;
		this.userLocation = userLocation;
		this.orderCreate = orderCreate;
		this.orderDone = orderDone;
		this.productKcalTotal = productKcalTotal;
		this.total = total;
		this.delCost = delCost;
		this.useCash = useCash;
		this.creditId = creditId;
		this.discount = discount;
		this.rating = rating;
		this.resRate = resRate;
		this.delRate = delRate;
		this.resComment = resComment;
		this.delComment = delComment;
		this.promoteId = promoteId;
		this.orderDetailVO = orderDetailVO;
		this.resVO = resVO;
		this.del = del;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getUserLocation() {
		return userLocation;
	}

	public void setUserLocation(String userLocation) {
		this.userLocation = userLocation;
	}

	public Timestamp getOrderCreate() {
		return orderCreate;
	}

	public void setOrderCreate(Timestamp orderCreate) {
		this.orderCreate = orderCreate;
	}

	public Timestamp getOrderDone() {
		return orderDone;
	}

	public void setOrderDone(Timestamp orderDone) {
		this.orderDone = orderDone;
	}

	public Integer getProductKcalTotal() {
		return productKcalTotal;
	}

	public void setProductKcalTotal(Integer productKcalTotal) {
		this.productKcalTotal = productKcalTotal;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getDelCost() {
		return delCost;
	}

	public void setDelCost(Integer delCost) {
		this.delCost = delCost;
	}

	public Boolean getUseCash() {
		return useCash;
	}

	public void setUseCash(Boolean useCash) {
		this.useCash = useCash;
	}

	public String getCreditId() {
		return creditId;
	}

	public void setCreditId(String creditId) {
		this.creditId = creditId;
	}

	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

	public Boolean getRating() {
		return rating;
	}

	public void setRating(Boolean rating) {
		this.rating = rating;
	}

	public Double getResRate() {
		return resRate;
	}

	public void setResRate(Double resRate) {
		this.resRate = resRate;
	}

	public Double getDelRate() {
		return delRate;
	}

	public void setDelRate(Double delRate) {
		this.delRate = delRate;
	}

	public String getResComment() {
		return resComment;
	}

	public void setResComment(String resComment) {
		this.resComment = resComment;
	}

	public String getDelComment() {
		return delComment;
	}

	public void setDelComment(String delComment) {
		this.delComment = delComment;
	}

	public Integer getPromoteId() {
		return promoteId;
	}

	public void setPromoteId(Integer promoteId) {
		this.promoteId = promoteId;
	}

	public Set<OrderDetailVO> getOrderDetailVO() {
		return orderDetailVO;
	}

	public void setOrderDetailVO(Set<OrderDetailVO> orderDetailVO) {
		this.orderDetailVO = orderDetailVO;
	}

	public ResVO getResVO() {
		return resVO;
	}

	public void setResVO(ResVO resVO) {
		this.resVO = resVO;
	}

	public DelBean getDel() {
		return del;
	}

	public void setDel(DelBean del) {
		this.del = del;
	}

	@Override
	public int hashCode() {
		return Objects.hash(orderId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderVO other = (OrderVO) obj;
		return Objects.equals(orderId, other.orderId);
	}
	
}
