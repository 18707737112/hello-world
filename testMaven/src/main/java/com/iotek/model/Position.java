package com.iotek.model;

import java.io.Serializable;

//职位表
public class Position implements Serializable {
    private Integer pos_id;//职位ID
    private Integer dep_id;//部门ID
    private Integer e_id;//员工ID
    private String pos_name;//职位名称

    public Position() {
    }

    public Position(Integer pos_id) {
        this.pos_id = pos_id;
    }

    public Position(Integer dep_id, Integer e_id, String pos_name) {
        this.dep_id = dep_id;
        this.e_id = e_id;
        this.pos_name = pos_name;
    }

    public Integer getPos_id() {
        return pos_id;
    }

    public void setPos_id(Integer pos_id) {
        this.pos_id = pos_id;
    }

    public Integer getDep_id() {
        return dep_id;
    }

    public void setDep_id(Integer dep_id) {
        this.dep_id = dep_id;
    }

    public Integer getE_id() {
        return e_id;
    }

    public void setE_id(Integer e_id) {
        this.e_id = e_id;
    }

    public String getPos_name() {
        return pos_name;
    }

    public void setPos_name(String pos_name) {
        this.pos_name = pos_name;
    }

    @Override
    public String toString() {
        return "HRM_position{" +
                "pos_id=" + pos_id +
                ", dep_id=" + dep_id +
                ", e_id=" + e_id +
                ", pos_name='" + pos_name + '\'' +
                '}';
    }
}
