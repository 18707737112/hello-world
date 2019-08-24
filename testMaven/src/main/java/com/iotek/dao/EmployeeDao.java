package com.iotek.dao;

import com.iotek.model.Employee;

import java.util.List;

public interface EmployeeDao {
    boolean addEmployee(Employee cv);
    boolean delEmployee(Integer id);
    boolean updateEmployee(Employee cv);
    List<Employee> getEmployee(Employee cv);
}
