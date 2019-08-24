package com.iotek.dao;

import com.iotek.model.Reward;

import java.util.List;

public interface RewardDao {
    boolean addReward(Reward reward);
    boolean delReward(Integer id);
    boolean updateReward(Reward reward);
    List<Reward> getReward(Reward reward);
}
