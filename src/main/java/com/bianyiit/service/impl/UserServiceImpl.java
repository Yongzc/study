package com.bianyiit.service.impl;

import com.bianyiit.dao.IUserDao;
import com.bianyiit.domain.User;
import com.bianyiit.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Author zeika
 * @Date 2020/8/25 11:20
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    IUserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.selectAll();
    }

    @Override
    public void addUser(User user) {
        userDao.insertUser(user);
    }
}
