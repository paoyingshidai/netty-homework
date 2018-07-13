
package com.chat.commons.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.chat.commons.entity.User;

@Mapper
public interface UserMapper {

    User getById(@Param("id")Integer id);

    void add(User user);

}
