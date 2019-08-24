package com.iotek.dao;

import com.iotek.model.Department;

import java.util.List;

public interface DepartmentDao {
    boolean addDepartment(Department department);
    boolean delDepartment(Integer id);
    boolean updateDepartment(Department department);
    List<Department> getDepartment(Department department);
}
