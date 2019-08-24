package com.iotek.model;

import java.io.Serializable;
import java.util.Date;

//员工表
public class Employee implements Serializable {
    private Integer e_id;//ID
    private String e_account;//账号
    private String e_pass;//密码
    //private String e_type;//账号类型
    private String e_name;//姓名
    private char e_gender;//性别
    private String e_address;//住址
    private String e_phone;//电话
    private String e_debit;//银行卡号
    private Date e_enroll_date;//入职时间
    private Integer e_state;//工作状态
    private Integer e_salary;//薪资

    public Employee() {
    }

    public Employee(Integer e_id) {
        this.e_id = e_id;
    }

    public Employee(String e_account, String e_pass, String e_name, char e_gender, String e_address, String e_phone, String e_debit, Date e_enroll_date, Integer e_state, Integer e_salary) {
        this.e_account = e_account;
        this.e_pass = e_pass;
        this.e_name = e_name;
        this.e_gender = e_gender;
        this.e_address = e_address;
        this.e_phone = e_phone;
        this.e_debit = e_debit;
        this.e_enroll_date = e_enroll_date;
        this.e_state = e_state;
        this.e_salary = e_salary;
    }

    public Integer getE_id() {
        return e_id;
    }

    public void setE_id(Integer e_id) {
        this.e_id = e_id;
    }

    public String getE_account() {
        return e_account;
    }

    public void setE_account(String e_account) {
        this.e_account = e_account;
    }

    public String getE_pass() {
        return e_pass;
    }

    public void setE_pass(String e_pass) {
        this.e_pass = e_pass;
    }

    public String getE_name() {
        return e_name;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }

    public char getE_gender() {
        return e_gender;
    }

    public void setE_gender(char e_gender) {
        this.e_gender = e_gender;
    }

    public String getE_address() {
        return e_address;
    }

    public void setE_address(String e_address) {
        this.e_address = e_address;
    }

    public String getE_phone() {
        return e_phone;
    }

    public void setE_phone(String e_phone) {
        this.e_phone = e_phone;
    }

    public String getE_debit() {
        return e_debit;
    }

    public void setE_debit(String e_debit) {
        this.e_debit = e_debit;
    }

    public Date getE_enroll_date() {
        return e_enroll_date;
    }

    public void setE_enroll_date(Date e_enroll_date) {
        this.e_enroll_date = e_enroll_date;
    }

    public Integer getE_state() {
        return e_state;
    }

    public void setE_state(Integer e_state) {
        this.e_state = e_state;
    }

    public Integer getE_salary() {
        return e_salary;
    }

    public void setE_salary(Integer e_salary) {
        this.e_salary = e_salary;
    }

    @Override
    public String toString() {
        return "HRM_employee{" +
                "e_id=" + e_id +
                ", e_account='" + e_account + '\'' +
                ", e_pass='" + e_pass + '\'' +
                ", e_name='" + e_name + '\'' +
                ", e_gender=" + e_gender +
                ", e_address='" + e_address + '\'' +
                ", e_phone='" + e_phone + '\'' +
                ", e_debit='" + e_debit + '\'' +
                ", e_enroll_date=" + e_enroll_date +
                ", e_state=" + e_state +
                ", e_salary=" + e_salary +
                '}';
    }
}
