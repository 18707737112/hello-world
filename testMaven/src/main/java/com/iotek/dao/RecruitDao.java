package com.iotek.dao;

import com.iotek.model.Recruit;

import java.util.List;

public interface RecruitDao {
    boolean addRecruit(Recruit recruit);
    boolean delRecruit(Integer id);
    boolean updateRecruit(Recruit recruit);
    List<Recruit> getRecruit(Recruit recruit);
}
