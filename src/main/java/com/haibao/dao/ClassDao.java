package com.haibao.dao;

import com.haibao.model.po.Class;

public interface ClassDao {
    int deleteByPrimaryKey(Integer cid);

    int insert(Class record);

    int insertSelective(Class record);

    Class selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Class record);

    int updateByPrimaryKey(Class record);
}