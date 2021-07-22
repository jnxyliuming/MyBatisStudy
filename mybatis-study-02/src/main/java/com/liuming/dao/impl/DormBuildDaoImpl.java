package com.liuming.dao.impl;

import com.liuming.dao.DormBuildDao;
import com.liuming.domain.DormBuild;
import com.liuming.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class DormBuildDaoImpl implements DormBuildDao {
    @Override
    public List<DormBuild> selectDormBuild() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        String sqlId = "com.liuming.dao.DormBuildDao.selectDormBuild";
        //执行sql语句
        List<DormBuild> dormBuildList = sqlSession.selectList(sqlId);
        sqlSession.close();
        return dormBuildList;
    }

    @Override
    public int insertDormBuild(DormBuild dormBuild) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        String sqlId = "com.liuming.dao.DormBuildDao.insertDormBuild";
        int num = sqlSession.insert(sqlId,dormBuild);
        return num;
    }
}
