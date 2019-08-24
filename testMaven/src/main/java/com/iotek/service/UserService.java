package com.iotek.service;

import com.iotek.model.Customer;

public interface UserService {
    void test();
    Customer loginCustomer(Customer customer);
    boolean registerCustomer(Customer customer);
}
