package com.liuming;

import com.liuming.dao.DormBuildDao;
import com.liuming.domain.DormBuild;
import com.liuming.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestSelectIf {
    @Test
    public void testSelectIf(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        DormBuildDao dormBuildDao = sqlSession.getMapper(DormBuildDao.class);
        DormBuild dormBuild = new DormBuild("男生宿舍1","计算机科学系",0);
        List<DormBuild> dormBuildList = dormBuildDao.selectDormIf(dormBuild);
        for (DormBuild dormI:
             dormBuildList) {
            System.out.println(dormI.toString());
        }
    }
}
