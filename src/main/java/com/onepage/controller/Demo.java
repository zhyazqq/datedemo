package com.onepage.controller;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onepage.pojo.QueryInfo;
import com.onepage.pojo.User;
import com.onepage.service.SelectInfo;

@RestController
@RequestMapping("/demo")
public class Demo {

	@Resource
	private SelectInfo selectInfo;
	@RequestMapping("/date")
	public List<User> getUserDate(@RequestBody QueryInfo queryInfo) {
		
		System.out.println("here");
		System.out.println(queryInfo);
		return selectInfo.QueryUsers(queryInfo);
		
	}
	@GetMapping("/time")
	public Timestamp getUDate(String timestamp ) {
		Timestamp time = new Timestamp(Long.parseLong(timestamp));
		return time;
	}
}
