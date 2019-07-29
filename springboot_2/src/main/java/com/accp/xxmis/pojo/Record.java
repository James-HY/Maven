package com.accp.xxmis.pojo;

import java.util.Date;

public class Record {
		private int id;
		private String name;
		private String stuCode;
		private Date createDate;
		private String createBy;
		private String des;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getStuCode() {
			return stuCode;
		}
		public void setStuCode(String stuCode) {
			this.stuCode = stuCode;
		}
		public Date getCreateDate() {
			return createDate;
		}
		public void setCreateDate(Date createDate) {
			this.createDate = createDate;
		}
		public String getCreateBy() {
			return createBy;
		}
		public void setCreateBy(String createBy) {
			this.createBy = createBy;
		}
		public String getDes() {
			return des;
		}
		public void setDes(String des) {
			this.des = des;
		}
		public Record(int id, String name, String stuCode, Date createDate, String createBy, String des) {
			super();
			this.id = id;
			this.name = name;
			this.stuCode = stuCode;
			this.createDate = createDate;
			this.createBy = createBy;
			this.des = des;
		}
		public Record() {
			super();
		}
}
