package com.test.manager.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.test.manager.entity.UserModel;

@Mapper
public interface UserDao {

	List<UserModel> getUser(@Param("userId") String userId);

	int delete(String id);

	int add(UserModel entity);

	int update(UserModel entity);

	UserModel getUserByName(@Param("username") String username);

	UserModel getUserByNameAndPassword(@Param("username") String username, @Param("password") String password);
}
