package com.monfood.boot.res;

import java.io.Serializable;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "RES")
public class ResVO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "RES_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer resId;
	
	@Column(name = "RES_CATEGORY")
	private Integer resCategory;
	
	@Column(name = "RES_ACCOUNT")
	private String resAccount;
	
	@Column(name = "UPDATE_TIME")
	private java.sql.Timestamp updateTime;
	
	@Column(name = "RES_NAME")
	private String resName;
	
	@Column(name = "RES_PASSWORD")
	private String resPassword;
	
	@Column(name = "RES_TEL")
	private String resTel;
	
	@Column(name = "RES_PIC")
	@Type(type="org.hibernate.type.ImageType")
	private byte[] resPic;
	
	@Column(name = "OWNER_NAME")
	private String ownerName;
	
	@Column(name = "OWNER_TEL")
	private String ownerTel;
	
	@Column(name = "BZ_LOCATION")
	private String bzLocation;
	
	@Column(name = "ZIP_CODE")
	private Integer zipCode;
	
	@Column(name = "BZ_OPEN_HOURS")
	private java.sql.Time bzOpenHours;
	
	@Column(name = "BZ_CLOSE_HOURS")
	private java.sql.Time bzCloseHours;
	
	@Column(name = "BZ_WEEK_TIME")
	private Integer bzWeekTime;
	

	public ResVO() {
		super();
	}

	public ResVO(Integer resId, Integer resCategory, String resAccount, Timestamp updateTime, String resName,
			String resPassword, String resTel, byte[] resPic, String ownerName, String ownerTel, String bzLocation,
			Integer zipCode, Time bzOpenHours, Time bzCloseHours, Integer bzWeekTime) {
		super();
		this.resId = resId;
		this.resCategory = resCategory;
		this.resAccount = resAccount;
		this.updateTime = updateTime;
		this.resName = resName;
		this.resPassword = resPassword;
		this.resTel = resTel;
		this.resPic = resPic;
		this.ownerName = ownerName;
		this.ownerTel = ownerTel;
		this.bzLocation = bzLocation;
		this.zipCode = zipCode;
		this.bzOpenHours = bzOpenHours;
		this.bzCloseHours = bzCloseHours;
		this.bzWeekTime = bzWeekTime;
	}

	@Override
	public String toString() {
		return "ResVO [resId=" + resId + ", resCategory=" + resCategory + ", resAccount=" + resAccount + ", updateTime="
				+ updateTime + ", resName=" + resName + ", resPassword=" + resPassword + ", resTel=" + resTel
				+ ", resPic=" + Arrays.toString(resPic) + ", ownerName=" + ownerName + ", ownerTel=" + ownerTel
				+ ", bzLocation=" + bzLocation + ", zipCode=" + zipCode + ", bzOpenHours=" + bzOpenHours
				+ ", bzCloseHours=" + bzCloseHours + ", bzWeekTime=" + bzWeekTime + "]";
	}

	public Integer getResId() {
		return resId;
	}

	public void setResId(Integer resId) {
		this.resId = resId;
	}

	public Integer getResCategory() {
		return resCategory;
	}

	public void setResCategory(Integer resCategory) {
		this.resCategory = resCategory;
	}

	public String getResAccount() {
		return resAccount;
	}

	public void setResAccount(String resAccount) {
		this.resAccount = resAccount;
	}

	public java.sql.Timestamp getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(java.sql.Timestamp updateTime) {
		this.updateTime = updateTime;
	}

	public String getResName() {
		return resName;
	}

	public void setResName(String resName) {
		this.resName = resName;
	}

	public String getResPassword() {
		return resPassword;
	}

	public void setResPassword(String resPassword) {
		this.resPassword = resPassword;
	}

	public String getResTel() {
		return resTel;
	}

	public void setResTel(String resTel) {
		this.resTel = resTel;
	}

	public byte[] getResPic() {
		return resPic;
	}

	public void setResPic(byte[] resPic) {
		this.resPic = resPic;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerTel() {
		return ownerTel;
	}

	public void setOwnerTel(String ownerTel) {
		this.ownerTel = ownerTel;
	}

	public String getBzLocation() {
		return bzLocation;
	}

	public void setBzLocation(String bzLocation) {
		this.bzLocation = bzLocation;
	}

	public Integer getZipCode() {
		return zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	public java.sql.Time getBzOpenHours() {
		return bzOpenHours;
	}

	public void setBzOpenHours(java.sql.Time bzOpenHours) {
		this.bzOpenHours = bzOpenHours;
	}

	public java.sql.Time getBzCloseHours() {
		return bzCloseHours;
	}

	public void setBzCloseHours(java.sql.Time bzCloseHours) {
		this.bzCloseHours = bzCloseHours;
	}

	public Integer getBzWeekTime() {
		return bzWeekTime;
	}

	public void setBzWeekTime(Integer bzWeekTime) {
		this.bzWeekTime = bzWeekTime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
