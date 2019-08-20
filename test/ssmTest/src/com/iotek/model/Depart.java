package com.iotek.model;

public class Depart {
    private Integer id;
    private String dname;

    public Depart() {
    }

    public Depart(String dname) {
        this.dname = dname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return dname;
    }
}
