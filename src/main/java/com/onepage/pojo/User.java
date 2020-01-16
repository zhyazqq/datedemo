package com.onepage.pojo;

import java.sql.Timestamp;

public class User {

	private Integer id;
	private String name;
	private Timestamp time;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", time=" + time + "]";
	}
	public User(Integer id, String name, Timestamp time) {
		super();
		this.id = id;
		this.name = name;
		this.time = time;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}