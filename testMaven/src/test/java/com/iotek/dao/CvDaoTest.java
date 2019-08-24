package com.iotek.dao;

import com.iotek.model.Cv;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;

import java.io.IOException;
import java.io.Reader;
import java.util.Date;

public class CvDaoTest {
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
        CvDao cvDao=sqlSession.getMapper(CvDao.class);
        Date date = new Date(1995,7,27);
        Date date1 = new Date(2013,9,1);
        Date date2 = new Date(2017,6,28);
        Cv cv = new Cv(5,"aaa",'男',date,"上海","交大","本科","电信",date1,date2,"5000","哈哈哈哈","简历1");
        boolean flag = cvDao.addCv(cv);
        sqlSession.commit();
        System.out.println(flag);
    }
}