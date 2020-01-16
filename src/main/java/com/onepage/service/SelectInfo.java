package com.onepage.service;

import java.util.List;

import com.onepage.pojo.QueryInfo;
import com.onepage.pojo.User;

public interface SelectInfo {
	List<User> QueryUsers(QueryInfo queryInfo);
}
