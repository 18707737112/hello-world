package com.iotek.service;

import com.iotek.model.User;

public interface UserService {
    User getLogin(User user);
    boolean getRegister(User user);
}
