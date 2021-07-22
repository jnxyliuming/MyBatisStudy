package com.liuming;

import com.liuming.dao.DormBuildDao;
import com.liuming.domain.DormBuild;
import com.liuming.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestSelect {
    @Test
    public void testSelect01(){
        //获取sqlSession
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        //实现动态代理，能够实现根据Dao的所在路径和方法名找到sqlId并且可以返回查询数据，在路径对应namespace和id对应方法名的情况下，实现了查询并返回数据的操作，
        DormBuildDao dao = sqlSession.getMapper(DormBuildDao.class);
        List<DormBuild> dormBuilds = dao.selectDormBuild();
        for (DormBuild dormBuildI:
             dormBuilds) {
            System.out.println(dormBuildI.toString());
        }
    }
}
