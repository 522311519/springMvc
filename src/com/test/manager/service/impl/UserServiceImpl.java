package com.test.manager.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.test.manager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.manager.dao.UserDao;
import com.test.manager.entity.UserModel;

@Service
public class UserServiceImpl implements UserService {

    private UserDao userdao;

    @Autowired
    public UserServiceImpl(UserDao userdao) {
        this.userdao = userdao;
    }

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
