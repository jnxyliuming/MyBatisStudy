package com.liuming.dao;

import com.liuming.domain.TbDormBuild;

import java.util.List;

public interface DormBuildDao {
    //查询所有数据
    public List<TbDormBuild> selectBuilds();
    public int insertDormBuild(TbDormBuild tbDormBuild);
    public int insertDormBuildByClass(TbDormBuild tbDormBuild);

}
