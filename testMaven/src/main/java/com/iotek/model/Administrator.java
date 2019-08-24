package com.iotek.model;

import java.io.Serializable;

//管理员
public class Administrator implements Serializable {
    private Integer a_id;
    private String a_name;
    private String a_pass;

    public Administrator() {
    }

    public Administrator(Integer a_id) {
        this.a_id = a_id;
    }

    public Administrator(String a_name, String a_pass) {
        this.a_name = a_name;
        this.a_pass = a_pass;
    }

    public Integer getA_id() {
        return a_id;
    }

    public void setA_id(Integer a_id) {
        this.a_id = a_id;
    }

    public String getA_name() {
        return a_name;
    }

    public void setA_name(String a_name) {
        this.a_name = a_name;
    }

    public String getA_pass() {
        return a_pass;
    }

    public void setA_pass(String a_pass) {
        this.a_pass = a_pass;
    }

    @Override
    public String toString() {
        return "HRM_administrator{" +
                "a_id=" + a_id +
                ", a_name='" + a_name + '\'' +
                ", a_pass='" + a_pass + '\'' +
                '}';
    }
}
