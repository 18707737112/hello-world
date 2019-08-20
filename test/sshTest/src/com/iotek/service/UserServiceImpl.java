package com.iotek.service;

import com.iotek.dao.UserDao;
import com.iotek.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Resource
    private UserDao userDao;
    @Override
    public User getUserByLogin(User user) {
        List<User> users=userDao.getUser(user);
        if(users!=null&&users.size()!=0){
            return users.get(0);
        }
        return null;
    }
}
