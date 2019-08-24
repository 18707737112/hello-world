package com.iotek.dao;

import com.iotek.model.Attendence;

import java.util.List;

public interface AttendenceDao {
    boolean addAttendence(Attendence attendence);
    boolean delAttendence(Integer id);
    boolean updateAttendence(Attendence attendence);
    List<Attendence> getAttendence(Attendence attendence);
}
