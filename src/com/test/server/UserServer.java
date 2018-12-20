package com.test.server;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.test.mapper.UserDao;
import com.test.model.UserModel;

@Service
public class UserServer {
	@Resource
	UserDao userdao;

	public List<UserModel> getUser(String userId) {
		return userdao.getUser(userId);
	}

	public UserModel getUserByName(String username) {
		return userdao.getUserByName(username);
	}

	public int add(UserModel entity) {
		return userdao.add(entity);
	}

	public int delete(String id) {
		return userdao.delete(id);
	}

	public int update(UserModel entity) {
		return userdao.update(entity);
	}

}
