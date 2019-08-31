package com.project.eefinal.service;

import com.project.eefinal.dao.AdminDao;
import com.project.eefinal.model.Admin;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminService {
    @Resource
    private AdminDao adminDao;

    public boolean addAdmin(Admin admin){
        return adminDao.addAdmin(admin);
    }

    public Admin login(Admin admin){
        return adminDao.queryAdmin(admin);
    }
}
