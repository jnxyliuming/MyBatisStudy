package com.liuming;

import com.liuming.dao.DormBuildDao;
import com.liuming.domain.DormBuild;
import com.liuming.utils.MyBatisUtils;
import com.liuming.vo.QueryParam;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestSelectObject {
    @Test
    public void testSelectObject01(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        QueryParam queryParam = new QueryParam("男生宿舍1",0);

        DormBuildDao dormBuildDao = sqlSession.getMapper(DormBuildDao.class);
        List<DormBuild> dormBuildList = dormBuildDao.selectDormObject(queryParam);
        for (DormBuild dormBuildI:
             dormBuildList) {
            System.out.println(dormBuildI.toString());
        }
    }
}
