package com.iotek.model;

import java.io.Serializable;
import java.util.Date;

//考勤表
public class Attendence implements Serializable {
    private Integer atd_id;
    private Integer e_id;
    private Date atd_start_time;
    private Date atd_end_time;

    public Attendence() {
    }

    public Attendence(Integer atd_id) {
        this.atd_id = atd_id;
    }

    public Attendence(Integer e_id, Date atd_start_time, Date atd_end_time) {
        this.e_id = e_id;
        this.atd_start_time = atd_start_time;
        this.atd_end_time = atd_end_time;
    }

    public Integer getAtd_id() {
        return atd_id;
    }

    public void setAtd_id(Integer atd_id) {
        this.atd_id = atd_id;
    }

    public Integer getE_id() {
        return e_id;
    }

    public void setE_id(Integer e_id) {
        this.e_id = e_id;
    }

    public Date getAtd_start_time() {
        return atd_start_time;
    }

    public void setAtd_start_time(Date atd_start_time) {
        this.atd_start_time = atd_start_time;
    }

    public Date getAtd_end_time() {
        return atd_end_time;
    }

    public void setAtd_end_time(Date atd_end_time) {
        this.atd_end_time = atd_end_time;
    }

    @Override
    public String toString() {
        return "HRM_attendence{" +
                "atd_id=" + atd_id +
                ", e_id=" + e_id +
                ", atd_start_time=" + atd_start_time +
                ", atd_end_time=" + atd_end_time +
                '}';
    }
}
