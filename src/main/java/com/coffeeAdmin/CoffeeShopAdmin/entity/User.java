package com.coffeeAdmin.CoffeeShopAdmin.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
//@Table(name="Users")
public class User {
	@Id
	private int user_id;
	private String user_name;
	
	public User() {}

	public User(int user_id, String user_name) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	@Override
	public String toString() {
		return "Users [user_id=" + user_id + ", user_name=" + user_name + "]";
	}
	
}