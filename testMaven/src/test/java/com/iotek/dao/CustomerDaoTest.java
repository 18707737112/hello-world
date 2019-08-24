package com.iotek.dao;

import com.iotek.model.Customer;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;

import java.io.IOException;
import java.io.Reader;


public class CustomerDaoTest {
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
        CustomerDao customerDao=sqlSession.getMapper(CustomerDao.class);
        Customer customer = new Customer("bbb","bbb");
        boolean flag = customerDao.addCustomer(customer);
        System.out.println(flag);
        sqlSession.commit();
    }

    @org.junit.Test
    public void test2(){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        CustomerDao customerDao=sqlSession.getMapper(CustomerDao.class);
        Customer customer01 = new Customer("bbb","bbb");
        Customer customer02 = new Customer(6);
        //Customer customer03 = new Customer("","");
        Customer customer1 = customerDao.getCustomer(customer01);
        Customer customer2 = customerDao.getCustomer(customer02);
        //Customer customer3 = customerDao.getCustomer(customer03);
        System.out.println(customer1);
        System.out.println(customer2);
        //System.out.println(customer3);
    }

}