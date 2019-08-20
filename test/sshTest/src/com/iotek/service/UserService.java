package com.iotek.service;

import com.iotek.model.User;

/**
 * Created by 11929 on 2019/8/10.
 */
public interface UserService {
    User getUserByLogin(User user);
}
