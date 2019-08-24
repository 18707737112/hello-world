package com.iotek.service;

import com.iotek.model.Customer;
import org.junit.Test;

public class UserServiceImplTest {
    private UserService userService=new UserServiceImpl();

    @Test
    public void test(){
        userService.test();
    }

    @Test
    public void register(){
        Customer customer = new Customer("aaa","aaa");
        boolean flag = userService.registerCustomer(customer);
        System.out.println(false);
    }

    @Test
    public void login(){
        Customer customer1 = new Customer(1);
        Customer customer2 = new Customer("aaa","aaa");
        Customer customer3 = userService.loginCustomer(customer1);
        Customer customer4 = userService.loginCustomer(customer2);
        System.out.println(customer3+"========="+customer4);
    }
}