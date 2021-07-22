package com.liuming.dao;

import com.liuming.domain.DormBuild;
import com.liuming.vo.QueryParam;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DormBuildDao {
    DormBuild selectDormBuildById(Integer id);
    //使用mybatis的注解声明向mapper内传递参数的名称
    List<DormBuild> selectDormBuildByNameAndDis(@Param("bName") String name,
                                                @Param("bDis") Integer dis);
    List<DormBuild> selectDormObject(QueryParam queryParam);
    List<DormBuild> selectDormMap(@Param("sName") String name,@Param("sDis") Integer dis);
    List<DormBuild> selectDormLike(@Param("lName") String name);
}
