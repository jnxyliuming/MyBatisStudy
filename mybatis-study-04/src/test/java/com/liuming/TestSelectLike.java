package com.liuming;

import com.liuming.dao.DormBuildDao;
import com.liuming.domain.DormBuild;
import com.liuming.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestSelectLike {
    @Test
    public void testSelectLike01(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        DormBuildDao dormBuildDao= sqlSession.getMapper(DormBuildDao.class);
        List<DormBuild> dormBuildList= dormBuildDao.selectDormLike("男%");
        for (DormBuild dormI:
             dormBuildList) {
            System.out.println(dormI.toString());
        }
    }
}
