package com.onepage.mapper;



import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.onepage.pojo.QueryInfo;
import com.onepage.pojo.User;

@Mapper
public interface UserMapper {
//	@Select(value = { "select * from user " })
	List<User> query(QueryInfo queryInfo);
	@Select(value = { "select * from user where time>1579160101655" })
	List<User> queryInfo();
}
