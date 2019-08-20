package com.iotek.dao;

import com.iotek.model.User;

import java.util.List;

public interface UserDao {
    List<User> getUser(User user);
}
