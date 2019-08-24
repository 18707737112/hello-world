package com.iotek.dao;

import com.iotek.model.Training;

import java.util.List;

public interface TrainingDao {
    boolean addTraining(Training training);
    boolean delTraining(Integer id);
    boolean updateTraining(Training training);
    List<Training> getTraining(Training training);
}
