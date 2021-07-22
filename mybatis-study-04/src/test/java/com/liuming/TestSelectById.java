package com.liuming;

import com.liuming.dao.DormBuildDao;
import com.liuming.domain.DormBuild;
import com.liuming.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TestSelectById {
    @Test
    public void testSelectById01(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        DormBuildDao dormBuildDao = sqlSession.getMapper(DormBuildDao.class);
        DormBuild dormBuild = dormBuildDao.selectDormBuildById(1);
        System.out.println(dormBuild.toString());
    }
}
