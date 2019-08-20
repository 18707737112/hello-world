package com.iotek.dao;

import com.iotek.model.Depart;

import java.util.List;

public interface DepartDao {
    Depart getDepartById(int id);
    List<Depart> getAllDepart();
    boolean delDepart(int id);
}
