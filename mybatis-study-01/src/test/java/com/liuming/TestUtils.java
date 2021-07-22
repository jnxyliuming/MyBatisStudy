package com.liuming;

import com.liuming.domain.TbDormBuild;
import com.liuming.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestUtils {
    @Test
    public void testUtils01(){
        SqlSession sqlSession= MyBatisUtils.getSqlSession();
        String sqlId = "com.liuming.dao.DormBuildDao.selectBuilds";
        List<TbDormBuild> DormBuildList = sqlSession.selectList(sqlId);
        for (TbDormBuild  tbDormBuild:DormBuildList
             ) {
            System.out.println(tbDormBuild.toString());
        }
        sqlSession.close();
    }
}
