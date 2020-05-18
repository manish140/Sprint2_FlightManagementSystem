package com.cpg.fms.user.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name="user10")
@Entity
public class User {
	
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)  
	private Long userId;
	private String userName;
	private String userPassword;
	private Long userPhone;
	private String userEmail;
	
	public User(Long userId,String userName,String userPassword,Long userPhone,String userEmail) {
		this.userId=userId;
		this.userName=userName;
		this.userPassword=userPassword;
		this.userPhone=userPhone;
		this.userEmail=userEmail;
	}
	public User() {
		super();
	}
	

	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public Long getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(Long userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

}
