package com.neusoft.services.user.impl;



import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.neusoft.dao.user.UserDao;
import com.neusoft.domain.User;
import com.neusoft.services.user.UserServices;

@Service("userService")
public class UserServiceImpl implements UserServices {

	@Resource 
	private UserDao userDao;

	public User getUserById(String userId) {
		// TODO Auto-generated method stub
		return userDao.selectByPrimaryKey(userId);
	}

}
