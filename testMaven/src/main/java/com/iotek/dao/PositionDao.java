package com.iotek.dao;

import com.iotek.model.Position;

import java.util.List;

public interface PositionDao {
    boolean addPosition(Position cv);
    boolean delPosition(Integer id);
    boolean updatePosition(Position cv);
    List<Position> getPosition(Position cv);
}
