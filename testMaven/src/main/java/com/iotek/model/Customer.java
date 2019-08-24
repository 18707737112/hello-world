package com.iotek.model;

import java.io.Serializable;

//游客
public class Customer implements Serializable {
    private Integer c_id;//ID
    private String c_account;//账号
    private String c_pass;//密码

    public Customer() {
    }

    public Customer(Integer c_id) {
        this.c_id = c_id;
    }

    public Customer(String c_account, String c_pass) {
        this.c_account = c_account;
        this.c_pass = c_pass;
    }

    public Integer getC_id() {
        return c_id;
    }

    public void setC_id(Integer c_id) {
        this.c_id = c_id;
    }

    public String getC_account() {
        return c_account;
    }

    public void setC_account(String c_account) {
        this.c_account = c_account;
    }

    public String getC_pass() {
        return c_pass;
    }

    public void setC_pass(String c_pass) {
        this.c_pass = c_pass;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "c_id=" + c_id +
                ", c_account='" + c_account + '\'' +
                ", c_pass='" + c_pass + '\'' +
                '}';
    }
}
