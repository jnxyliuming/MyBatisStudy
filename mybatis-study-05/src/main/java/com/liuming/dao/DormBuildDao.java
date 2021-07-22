package com.liuming.dao;

import com.liuming.domain.DormBuild;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DormBuildDao {
   List<DormBuild> selectDormIf(DormBuild dormBuild);
}
