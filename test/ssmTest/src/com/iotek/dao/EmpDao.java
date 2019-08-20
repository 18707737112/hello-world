package com.iotek.dao;

import com.iotek.model.Depart;
import com.iotek.model.Emp;

import java.util.List;

public interface EmpDao {
    Emp getEmpByNameAndPass(Emp emp);
    List<Emp> getAllEmp();
    boolean addEmp(Emp emp);
}
