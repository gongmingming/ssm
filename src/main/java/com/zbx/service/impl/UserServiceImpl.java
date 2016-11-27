package com.zbx.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zbx.dao.UserDao;
import com.zbx.pojo.User;
import com.zbx.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public User getUserById(int userId) {
		
		return userDao.selectByPrimaryKey(userId);
	}

}
