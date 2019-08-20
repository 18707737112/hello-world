package com.iotek.dao;

import com.iotek.model.User;

public interface UserDao {
    User getUser(User user);
    boolean addUser(User user);
}
