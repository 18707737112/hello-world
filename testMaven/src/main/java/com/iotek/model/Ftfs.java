package com.iotek.model;

import java.io.Serializable;
import java.util.Date;

//面试系统表
public class Ftfs implements Serializable {
    private Integer f_id;//ID
    private Integer cv_id;//简历ID
    private Integer rct_id;//招聘ID
    private Date f_date;//面试时间
    private Integer f_is_read;//是否已读
    private Integer f_is_accept;//是否允许面试
    private Integer f_is_agree;//是否同意参加面试

    public Ftfs() {
    }

    public Ftfs(Integer f_id) {
        this.f_id = f_id;
    }

    public Ftfs(Integer cv_id, Integer rct_id, Date f_date, Integer f_is_read, Integer f_is_accept, Integer f_is_agree) {
        this.cv_id = cv_id;
        this.rct_id = rct_id;
        this.f_date = f_date;
        this.f_is_read = f_is_read;
        this.f_is_accept = f_is_accept;
        this.f_is_agree = f_is_agree;
    }

    public Integer getF_id() {
        return f_id;
    }

    public void setF_id(Integer f_id) {
        this.f_id = f_id;
    }

    public Integer getCv_id() {
        return cv_id;
    }

    public void setCv_id(Integer cv_id) {
        this.cv_id = cv_id;
    }

    public Integer getRct_id() {
        return rct_id;
    }

    public void setRct_id(Integer rct_id) {
        this.rct_id = rct_id;
    }

    public Date getF_date() {
        return f_date;
    }

    public void setF_date(Date f_date) {
        this.f_date = f_date;
    }

    public Integer getF_is_read() {
        return f_is_read;
    }

    public void setF_is_read(Integer f_is_read) {
        this.f_is_read = f_is_read;
    }

    public Integer getF_is_accept() {
        return f_is_accept;
    }

    public void setF_is_accept(Integer f_is_accept) {
        this.f_is_accept = f_is_accept;
    }

    public Integer getF_is_agree() {
        return f_is_agree;
    }

    public void setF_is_agree(Integer f_is_agree) {
        this.f_is_agree = f_is_agree;
    }

    @Override
    public String toString() {
        return "HRM_ftfs{" +
                "f_id=" + f_id +
                ", cv_id=" + cv_id +
                ", rct_id=" + rct_id +
                ", f_date=" + f_date +
                ", f_is_read=" + f_is_read +
                ", f_is_accept=" + f_is_accept +
                ", f_is_agree=" + f_is_agree +
                '}';
    }
}
