package com.iotek.dao;

import com.iotek.model.Salary;

import java.util.List;

public interface SalaryDao {
    boolean addSalary(Salary salary);
    boolean delSalary(Integer id);
    boolean updateSalary(Salary salary);
    List<Salary> getSalary(Salary salary);
}
