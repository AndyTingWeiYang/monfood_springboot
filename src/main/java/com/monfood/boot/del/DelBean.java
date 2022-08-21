package com.monfood.boot.del;

import java.sql.Blob;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.monfood.boot.order.OrderVO;

@Entity
@Table(name="DEL")
@NamedQueries(value = {
		@NamedQuery(name = "del.DelBean.all", query = "From DelBean"),
		@NamedQuery(name = "del.DelBean.getComment", query = "select DEL_COMMENT, count() from ORDER o, DEL d where o.DEL_ID = d.DEL_ID")
})

public class DelBean {
	
	@OneToMany(
			mappedBy = "del",
			cascade = CascadeType.ALL
	)
	private Set<OrderVO> orders;
	

	public Set<OrderVO> getOrders() {
		return orders;
	}

	public void setOrders(Set<OrderVO> orders) {
		this.orders = orders;
	}

	@Id
	@Column(name = "DEL_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer delid;
	
	@Column(name = "DEL_NAME")
	private String delname;
	
	@Column(name = "DEL_ACCOUNT")
	private String delaccount;
	
	@Column(name = "DEL_PASSWORD")
	private String delpassword;
	
	@Column(name = "DEL_TEL")
	private String deltel;
	
	@Column(name = "DEL_BIRTHDAY")
	private Date delbirthday;
	
	@Column(name = "PLATENUMBER")
	private String platenumber;
	
	@Column(name = "STATUS")
	private Integer status;
	
	@Column(name = "UPDATE_TIME")
	private Timestamp updatetime;
	
	@Column(name = "DEL_ID_PHOTO")
	private Blob delidphoto;
	
	@Column(name = "CAR_LICENSE")
	private Blob carlicense;
	
	@Column(name = "DRIVE_LICENSE")
	private Blob drivelicense;
	
	@Column(name = "CRIMINAL_RECORD")
	private Blob criminalrecord;
	
	@Column(name = "INSURANCE")
	private Blob insurance;
	
	@Column(name = "DEL_ACCOUNT_NAME")
	private String delaccountname;
	
	@Column(name = "DEL_BANKNAME")
	private String dlebankname;
	
	@Column(name = "DEL_BANKCODE")
	private String delbankcode;
	
	@Column(name = "DEL_BANKACCOUNT")
	private String delbankaccount;

	@Override
	public String toString() {
		return "DelBean [delIDid=" + delid + ", delname=" + delname + ", delaccount=" + delaccount + ", delpassword="
				+ delpassword + ", deltel=" + deltel + ", delbirthday=" + delbirthday + ", platenumber=" + platenumber
				+ ", status=" + status + ", updatetime=" + updatetime + ", delidphoto=" + delidphoto + ", carlicense="
				+ carlicense + ", drivelicense=" + drivelicense + ", criminalrecord=" + criminalrecord + ", insurance="
				+ insurance + ", delaccountname=" + delaccountname + ", dlebankname=" + dlebankname + ", delbankcode="
				+ delbankcode + ", delbankaccount=" + delbankaccount + "]";
	}

	public DelBean() {
		super();
	}

	public Integer getDelid() {
		return delid;
	}

	public void setDelid(Integer delid) {
		this.delid = delid;
	}

	public String getDelname() {
		return delname;
	}

	public void setDelname(String delname) {
		this.delname = delname;
	}

	public String getDelaccount() {
		return delaccount;
	}

	public void setDelaccount(String delaccount) {
		this.delaccount = delaccount;
	}

	public String getDelpassword() {
		return delpassword;
	}

	public void setDelpassword(String delpassword) {
		this.delpassword = delpassword;
	}

	public String getDeltel() {
		return deltel;
	}

	public void setDeltel(String deltel) {
		this.deltel = deltel;
	}

	public Date getDelbirthday() {
		return delbirthday;
	}

	public void setDelbirthday(Date delbirthday) {
		this.delbirthday = delbirthday;
	}

	public String getPlatenumber() {
		return platenumber;
	}

	public void setPlatenumber(String platenumber) {
		this.platenumber = platenumber;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Timestamp getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Timestamp updatetime) {
		this.updatetime = updatetime;
	}

	public Blob getDelidphoto() {
		return delidphoto;
	}

	public void setDelidphoto(Blob delidphoto) {
		this.delidphoto = delidphoto;
	}

	public Blob getCarlicense() {
		return carlicense;
	}

	public void setCarlicense(Blob carlicense) {
		this.carlicense = carlicense;
	}

	public Blob getDrivelicense() {
		return drivelicense;
	}

	public void setDrivelicense(Blob drivelicense) {
		this.drivelicense = drivelicense;
	}

	public Blob getCriminalrecord() {
		return criminalrecord;
	}

	public void setCriminalrecord(Blob criminalrecord) {
		this.criminalrecord = criminalrecord;
	}

	public Blob getInsurance() {
		return insurance;
	}

	public void setInsurance(Blob insurance) {
		this.insurance = insurance;
	}

	public String getDelaccountname() {
		return delaccountname;
	}

	public void setDelaccountname(String delaccountname) {
		this.delaccountname = delaccountname;
	}

	public String getDlebankname() {
		return dlebankname;
	}

	public void setDlebankname(String dlebankname) {
		this.dlebankname = dlebankname;
	}

	public String getDelbankcode() {
		return delbankcode;
	}

	public void setDelbankcode(String delbankcode) {
		this.delbankcode = delbankcode;
	}

	public String getDelbankaccount() {
		return delbankaccount;
	}

	public void setDelbankaccount(String delbankaccount) {
		this.delbankaccount = delbankaccount;
	}

	
	
	
	
 	

}
