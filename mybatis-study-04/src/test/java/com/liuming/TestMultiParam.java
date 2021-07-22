package com.liuming;

import com.liuming.dao.DormBuildDao;
import com.liuming.domain.DormBuild;
import com.liuming.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestMultiParam {
    @Test
    public void testMultiParam01(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        DormBuildDao dormBuildDao = sqlSession.getMapper(DormBuildDao.class);
        List<DormBuild> dormBuildList=dormBuildDao.selectDormBuildByNameAndDis("男生宿舍1",0);
        for (DormBuild dormBuildI:
             dormBuildList) {
            System.out.println(dormBuildI.toString());
        }
    }
}
