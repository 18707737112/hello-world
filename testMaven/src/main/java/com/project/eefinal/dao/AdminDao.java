package com.project.eefinal.dao;

import com.project.eefinal.model.Admin;

public interface AdminDao {
    boolean addAdmin(Admin admin);
    Admin queryAdmin(Admin admin);
}
