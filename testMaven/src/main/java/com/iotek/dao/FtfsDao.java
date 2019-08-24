package com.iotek.dao;

import com.iotek.model.Ftfs;

import java.util.List;

public interface FtfsDao {
    boolean addFtfs(Ftfs ftfs);
    boolean delFtfs(Integer id);
    boolean updateFtfs(Ftfs ftfs);
    List<Ftfs> getFtfs(Ftfs ftfs);
}
