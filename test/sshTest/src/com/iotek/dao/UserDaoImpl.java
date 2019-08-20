package com.iotek.dao;

import com.iotek.model.User;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @Resource
    private HibernateTemplate hibernateTemplate;
    @Override
    public List<User> getUser(User user) {
        String hql="from User where name=? and pass=?";
        return (List<User>) hibernateTemplate.find(hql,user.getName(),user.getPass());
    }
}
