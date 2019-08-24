package com.iotek.model;

import java.io.Serializable;
import java.util.Date;

//薪资表
public class Salary implements Serializable {
    private Integer s_id;//ID
    private Integer e_id;//员工ID
    private Date s_date;//结算日期
    private Integer s_performance;//绩效奖金
    private Integer s_extra;//加班费用
    private Integer s_reward;//奖惩费用
    private Integer s_s_insurance;//社保
    private Integer s_total;//总计
    private Integer s_is_trouble;//复议状态

    public Salary() {
    }

    public Salary(Integer s_id) {
        this.s_id = s_id;
    }

    public Salary(Integer e_id, Date s_date, Integer s_performance, Integer s_extra, Integer s_reward, Integer s_s_insurance, Integer s_total, Integer s_is_trouble) {
        this.e_id = e_id;
        this.s_date = s_date;
        this.s_performance = s_performance;
        this.s_extra = s_extra;
        this.s_reward = s_reward;
        this.s_s_insurance = s_s_insurance;
        this.s_total = s_total;
        this.s_is_trouble = s_is_trouble;
    }

    public Integer getS_id() {
        return s_id;
    }

    public void setS_id(Integer s_id) {
        this.s_id = s_id;
    }

    public Integer getE_id() {
        return e_id;
    }

    public void setE_id(Integer e_id) {
        this.e_id = e_id;
    }

    public Date getS_date() {
        return s_date;
    }

    public void setS_date(Date s_date) {
        this.s_date = s_date;
    }

    public Integer getS_performance() {
        return s_performance;
    }

    public void setS_performance(Integer s_performance) {
        this.s_performance = s_performance;
    }

    public Integer getS_extra() {
        return s_extra;
    }

    public void setS_extra(Integer s_extra) {
        this.s_extra = s_extra;
    }

    public Integer getS_reward() {
        return s_reward;
    }

    public void setS_reward(Integer s_reward) {
        this.s_reward = s_reward;
    }

    public Integer getS_s_insurance() {
        return s_s_insurance;
    }

    public void setS_s_insurance(Integer s_s_insurance) {
        this.s_s_insurance = s_s_insurance;
    }

    public Integer getS_total() {
        return s_total;
    }

    public void setS_total(Integer s_total) {
        this.s_total = s_total;
    }

    public Integer getS_is_trouble() {
        return s_is_trouble;
    }

    public void setS_is_trouble(Integer s_is_trouble) {
        this.s_is_trouble = s_is_trouble;
    }

    @Override
    public String toString() {
        return "HRM_salary{" +
                "s_id=" + s_id +
                ", e_id=" + e_id +
                ", s_date=" + s_date +
                ", s_performance=" + s_performance +
                ", s_extra=" + s_extra +
                ", s_reward=" + s_reward +
                ", s_s_insurance=" + s_s_insurance +
                ", s_total=" + s_total +
                ", s_is_trouble=" + s_is_trouble +
                '}';
    }
}
