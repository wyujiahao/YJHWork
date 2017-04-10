package com.neusoft.dao.user.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.neusoft.dao.user.UserDao;
import com.neusoft.domain.User;
import com.neusoft.mapper.UserMapper;
@Repository
public class UserDaoImpl implements UserDao {
	@Resource 
	private UserMapper usersMapper;
	public User selectByPrimaryKey(String userId) {
		// TODO Auto-generated method stub
		return usersMapper.selectByPrimaryKey(userId);
	}

}
