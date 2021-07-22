package com.liuming.dao;

import com.liuming.domain.DormBuild;

import java.util.List;

public interface DormBuildDao {
    List<DormBuild> selectDormBuild();
    int insertDormBuild(DormBuild dormBuild);
}
