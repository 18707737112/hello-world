package com.iotek.service;

import com.iotek.dao.CustomerDao;
import com.iotek.model.Customer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService{
    @Resource
    private CustomerDao customerDao;

    @Override
    public void test() {
        System.out.println("-------ok-------");
    }

    @Override
    public Customer loginCustomer(Customer customer) {
        return customerDao.getCustomer(customer);
    }

    @Override
    public boolean registerCustomer(Customer customer) {
        if (customer==null){
            return false;
        }
        if (customer.getC_account()==null||customer.getC_pass()==null){
            return false;
        }
        return customerDao.addCustomer(customer);
    }
}
