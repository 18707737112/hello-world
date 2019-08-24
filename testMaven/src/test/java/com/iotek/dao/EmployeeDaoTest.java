package com.iotek.dao;

import com.iotek.model.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;

import java.io.IOException;
import java.io.Reader;
import java.util.Date;

public class EmployeeDaoTest {
    private SqlSessionFactory sqlSessionFactory=null;
    @Before
    public void init(){
        try {
            Reader reader = Resources.getResourceAsReader("mybatisConfig.xml");
            SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
            sqlSessionFactory=builder.build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void test1(){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        EmployeeDao employeeDao=sqlSession.getMapper(EmployeeDao.class);
        Date date = new Date();
        char sex = '男';
        Employee employee = new Employee("aaa","aaa","aaa",sex,"上海","18707737112","62266666666666777777778899955",date,1,5000);
        boolean flag = employeeDao.addEmployee(employee);
        System.out.println(flag);
        sqlSession.commit();
    }
}