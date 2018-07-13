package com.chat.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.chat.commons.dao.IUserDAO;
import com.chat.commons.entity.User;
import com.chat.service.IUserService;

@Service
public class UserService implements IUserService {

    @Autowired
    private IUserDAO userDAO;

	@Override
	public boolean login(String userName, String pwd) {

		List<User> us = userDAO.selectList(new EntityWrapper<User>()
				.where("userName={0}", userName));

		if (CollectionUtils.isEmpty(us)) {
			return false;
		} else {
			return us.get(0).getPassword().equals(pwd);
		}
	}

}
