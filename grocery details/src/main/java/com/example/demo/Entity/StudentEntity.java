package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="idcard_details")
public class StudentEntity {
@Id
@Column(name="id")
private int id;
@Column(name="")
private String StudentName;
@Column(name="DeptName")
private String DeptName;
@Column(name="sec")
private String sec;
@Column(name="mobile")
private long mobile;
@Column(name="mailid")
private String mailid;
@Column(name="address")
private String address;




public StudentEntity(int id, String studentName, String deptName, String sec, long mobile, String mailid,
		String address) {
	super();
	this.id = id;
	StudentName = studentName;
	DeptName = deptName;
	this.sec = sec;
	this.mobile = mobile;
	this.mailid = mailid;
	this.address = address;
}





public int getId() {
	return id;
}





public void setId(int id) {
	this.id = id;
}





public String getStudentName() {
	return StudentName;
}





public void setStudentName(String studentName) {
	StudentName = studentName;
}





public String getDeptName() {
	return DeptName;
}





public void setDeptName(String deptName) {
	DeptName = deptName;
}





public String getSec() {
	return sec;
}





public void setSec(String sec) {
	this.sec = sec;
}





public long getMobile() {
	return mobile;
}





public void setMobile(long mobile) {
	this.mobile = mobile;
}





public String getMailid() {
	return mailid;
}





public void setMailid(String mailid) {
	this.mailid = mailid;
}





public String getAddress() {
	return address;
}





public void setAddress(String address) {
	this.address = address;
}





public StudentEntity(){
	
}

}

