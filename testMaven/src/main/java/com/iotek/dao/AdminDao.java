package com.iotek.dao;

import com.iotek.model.Administrator;

public interface AdminDao {
    Administrator getAdmin(Administrator administrator);
    boolean addAdmin(Administrator administrator);
}
