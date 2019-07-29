package com.accp.xxmis.pojo;

import java.util.Date;


public class WebMessage {

	private Integer mid;
	private String mtitle;
	private String muser;
	private Date mdate;
	private Integer mstate;
	
	private String mimg="feng.jpg";
	

	public String getMimg() {
		return mimg;
	}

	public void setMimg(String mimg) {
		this.mimg = mimg;
	}

	public Integer getMid() {
		return mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
	}

	public String getMtitle() {
		return mtitle;
	}

	public void setMtitle(String mtitle) {
		this.mtitle = mtitle;
	}

	public String getMuser() {
		return muser;
	}

	public void setMuser(String muser) {
		this.muser = muser;
	}

	public Date getMdate() {
		return mdate;
	}

	public void setMdate(Date mdate) {
		this.mdate = mdate;
	}

	public WebMessage(String mtitle, String muser) {
		super();
		this.mtitle = mtitle;
		this.muser = muser;
	}

	public WebMessage(String mtitle, String muser, Date mdate) {
		super();
		this.mtitle = mtitle;
		this.muser = muser;
		this.mdate = mdate;
	}

	public WebMessage() {
		super();
	}

	public WebMessage(String mtitle, String muser, Date mdate, Integer mstate) {
		super();
		this.mtitle = mtitle;
		this.muser = muser;
		this.mdate = mdate;
		this.mstate = mstate;
	}

	public Integer getMstate() {
		return mstate;
	}

	public void setMstate(Integer mstate) {
		this.mstate = mstate;
	}

}
