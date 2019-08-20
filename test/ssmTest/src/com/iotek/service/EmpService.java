package com.iotek.service;

import com.iotek.model.Depart;
import com.iotek.model.Emp;

import java.util.List;

public interface EmpService {
    Emp getLogin(Emp emp);
    List<Emp> getAllEmp();
    List<Depart> getAllDepart();
    boolean addEmp(Emp emp);
    boolean delDepart(int id);
    Depart getDepartById(int id);
}
