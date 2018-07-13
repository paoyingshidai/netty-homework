package com.chat.commons.dao;

import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.chat.commons.entity.User;

@Repository
public interface IUserDAO extends BaseMapper<User> {

}
