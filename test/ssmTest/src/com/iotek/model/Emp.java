package com.iotek.model;

public class Emp {
    private Integer id;
    private String name;
    private String pass;
    private Integer age;
    private Depart depart;
    private double money;

    public Emp() {
    }

    public Emp(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    public Emp(String name, String pass, Integer age, Depart depart, double money) {
        this.name = name;
        this.pass = pass;
        this.age = age;
        this.depart = depart;
        this.money = money;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Depart getDepart() {
        return depart;
    }

    public void setDepart(Depart depart) {
        this.depart = depart;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                ", age=" + age +
                ", depart=" + depart +
                ", money=" + money +
                '}';
    }
}
