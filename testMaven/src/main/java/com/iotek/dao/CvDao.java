package com.iotek.dao;

import com.iotek.model.Cv;

import java.util.List;

public interface CvDao {
    boolean addCv(Cv cv);
    boolean delCv(Integer id);
    boolean updateCv(Cv cv);
    List<Cv> getCv(Cv cv);
}
