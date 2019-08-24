package com.iotek.dao;

import com.iotek.model.Administrator;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;

import java.io.IOException;
import java.io.Reader;

public class AdminDaoTest {
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
        AdminDao adminDao=sqlSession.getMapper(AdminDao.class);
        Administrator administrator1 = new Administrator("msy","msy");
        Administrator administrator2 = new Administrator("admin","admin");
        boolean flag1 = adminDao.addAdmin(administrator1);
        boolean flag2 = adminDao.addAdmin(administrator2);
        System.out.println(flag1+","+flag2);
        sqlSession.commit();
    }

    @org.junit.Test
    public void test2(){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        AdminDao adminDao=sqlSession.getMapper(AdminDao.class);
        Administrator administrator1 = new Administrator("msy","msy");
        Administrator administrator2 = new Administrator("admin","admin");
        Administrator administrator01 = adminDao.getAdmin(administrator1);
        Administrator administrator02 = adminDao.getAdmin(administrator2);
        System.out.println(administrator01+","+administrator02);
    }
}