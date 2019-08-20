package com.iotek.service;

import com.iotek.dao.UserDao;
import com.iotek.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public User getLogin(User user) {
        return userDao.getUser(user);
    }

    @Override
    public boolean getRegister(User user) {
        return userDao.addUser(user);
    }
}
