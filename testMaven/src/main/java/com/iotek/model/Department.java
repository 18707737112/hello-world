package com.iotek.model;

import java.io.Serializable;
import java.util.Date;

//部门表
public class Department implements Serializable {
    private Integer dep_id;//ID
    private String dep_name;//部门名称
    private Date dep_date;//建立时间

    public Department() {
    }

    public Department(Integer dep_id) {
        this.dep_id = dep_id;
    }

    public Department(String dep_name, Date dep_date) {
        this.dep_name = dep_name;
        this.dep_date = dep_date;
    }

    public Integer getDep_id() {
        return dep_id;
    }

    public void setDep_id(Integer dep_id) {
        this.dep_id = dep_id;
    }

    public String getDep_name() {
        return dep_name;
    }

    public void setDep_name(String dep_name) {
        this.dep_name = dep_name;
    }

    public Date getDep_date() {
        return dep_date;
    }

    public void setDep_date(Date dep_date) {
        this.dep_date = dep_date;
    }

    @Override
    public String toString() {
        return "HRM_department{" +
                "dep_id=" + dep_id +
                ", dep_name='" + dep_name + '\'' +
                ", dep_date=" + dep_date +
                '}';
    }
}
