package com.monfood.boot.promotelist;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.springframework.beans.factory.annotation.Value;

@Entity
@Table(name = "PROMOTE_LIST")
public class PromoteListVO implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "PROMOTE_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer promoteId;
	
	@Column(name = "PROMOTE_CODE")
	private String promoteCode;
	
	@Column(name = "PROMOTE_PRICE")
	private Integer promotePrice;
	
	@Column(name = "START_DATE")
	private java.sql.Date startDate;
	
	@Column(name = "END_DATE")
	private java.sql.Date endDate;
	
	@Column(name = "STATUS")
	private Integer status;
	
	public PromoteListVO() {
	}
	
	public PromoteListVO(Integer promoteId, String promoteCode, Integer promotePrice, Date startDate, Date endDate,
			Integer status) {
		super();
		this.promoteId = promoteId;
		this.promoteCode = promoteCode;
		this.promotePrice = promotePrice;
		this.startDate = startDate;
		this.endDate = endDate;
		this.status = status;
	}
	public Integer getPromoteId() {
		return promoteId;
	}
	public void setPromoteId(Integer promoteId) {
		this.promoteId = promoteId;
	}
	public String getPromoteCode() {
		return promoteCode;
	}
	public void setPromoteCode(String promoteCode) {
		this.promoteCode = promoteCode;
	}
	public Integer getPromotePrice() {
		return promotePrice;
	}
	public void setPromotePrice(Integer promotePrice) {
		this.promotePrice = promotePrice;
	}
	public java.sql.Date getStartDate() {
		return startDate;
	}
	public void setStartDate(java.sql.Date startDate) {
		this.startDate = startDate;
	}
	public java.sql.Date getEndDate() {
		return endDate;
	}
	public void setEndDate(java.sql.Date endDate) {
		this.endDate = endDate;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
		
	}

	@Override
	public String toString() {
		return "PromoteListVO [promoteId=" + promoteId + ", promoteCode=" + promoteCode + ", promotePrice="
				+ promotePrice + ", startDate=" + startDate + ", endDate=" + endDate + ", status=" + status + "]";
	}
}
