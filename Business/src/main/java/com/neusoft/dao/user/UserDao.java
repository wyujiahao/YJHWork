package com.neusoft.dao.user;

import com.neusoft.domain.User;

public interface UserDao {
	  User selectByPrimaryKey(String userId);
}
