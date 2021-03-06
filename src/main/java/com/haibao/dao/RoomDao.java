package com.haibao.dao;

import com.haibao.model.po.Room;

public interface RoomDao {
    int deleteByPrimaryKey(Integer rid);

    int insert(Room record);

    int insertSelective(Room record);

    Room selectByPrimaryKey(Integer rid);

    int updateByPrimaryKeySelective(Room record);

    int updateByPrimaryKey(Room record);
}