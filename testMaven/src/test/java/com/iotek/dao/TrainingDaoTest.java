package com.iotek.dao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;

import java.io.IOException;
import java.io.Reader;

import static org.junit.Assert.*;

public class TrainingDaoTest {
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
        TrainingDao trainingDao=sqlSession.getMapper(TrainingDao.class);

    }
}