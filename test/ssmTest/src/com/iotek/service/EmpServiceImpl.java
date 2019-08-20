package com.iotek.service;

import com.iotek.dao.DepartDao;
import com.iotek.dao.EmpDao;
import com.iotek.model.Depart;
import com.iotek.model.Emp;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("empService")
public class EmpServiceImpl implements EmpService{
    @Resource
    private EmpDao empDao;
    @Resource
    private DepartDao departDao;
    @Override
    public Emp getLogin(Emp emp) {
        return empDao.getEmpByNameAndPass(emp);
    }

    @Override
    public List<Emp> getAllEmp() {
        return empDao.getAllEmp();
    }

    @Override
    public List<Depart> getAllDepart() {
        return departDao.getAllDepart();
    }


    @Override
    public boolean addEmp(Emp emp) {
        return empDao.addEmp(emp);
    }

    @Override
    public boolean delDepart(int id) {
        return departDao.delDepart(id);
    }

    @Override
    public Depart getDepartById(int id) {
        return departDao.getDepartById(id);
    }

}
