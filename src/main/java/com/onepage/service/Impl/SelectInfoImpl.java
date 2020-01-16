package com.onepage.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import com.onepage.mapper.UserMapper;
import com.onepage.pojo.QueryInfo;
import com.onepage.pojo.User;
import com.onepage.service.SelectInfo;
@Service
public class SelectInfoImpl implements SelectInfo{
	@Resource
	private UserMapper Mapper;
	@Override
	public List<User> QueryUsers(QueryInfo queryInfo) {
		// TODO Auto-generated method stub
		return Mapper.query(queryInfo);
		
	}

}
