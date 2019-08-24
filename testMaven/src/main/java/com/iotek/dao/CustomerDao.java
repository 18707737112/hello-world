package com.iotek.dao;

import com.iotek.model.Customer;

public interface CustomerDao {
    Customer getCustomer(Customer customer);
    boolean addCustomer(Customer customer);
}
