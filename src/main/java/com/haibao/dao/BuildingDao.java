package com.haibao.dao;

import com.haibao.model.po.Building;

public interface BuildingDao {
    int deleteByPrimaryKey(Integer bid);

    int insert(Building record);

    int insertSelective(Building record);

    Building selectByPrimaryKey(Integer bid);

    int updateByPrimaryKeySelective(Building record);

    int updateByPrimaryKey(Building record);
}