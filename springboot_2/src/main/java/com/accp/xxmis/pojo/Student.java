package com.accp.xxmis.pojo;

import java.util.Date;

public class Student {
		private int id;
		private String code;
		private String name;
		private int major;
		private String grade;
		private int sex;
		private Date birthday;
		private int tel;
		private int job;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getMajor() {
			return major;
		}
		public void setMajor(int major) {
			this.major = major;
		}
		public String getGrade() {
			return grade;
		}
		public void setGrade(String grade) {
			this.grade = grade;
		}
		public int getSex() {
			return sex;
		}
		public void setSex(int sex) {
			this.sex = sex;
		}
		public Date getBirthday() {
			return birthday;
		}
		public void setBirthday(Date birthday) {
			this.birthday = birthday;
		}
		public int getTel() {
			return tel;
		}
		public void setTel(int tel) {
			this.tel = tel;
		}
		public int getJob() {
			return job;
		}
		public void setJob(int job) {
			this.job = job;
		}
		public Student(int id, String code, String name, int major, String grade, int sex, Date birthday, int tel,
				int job) {
			super();
			this.id = id;
			this.code = code;
			this.name = name;
			this.major = major;
			this.grade = grade;
			this.sex = sex;
			this.birthday = birthday;
			this.tel = tel;
			this.job = job;
		}
		public Student() {
			super();
		}
}
