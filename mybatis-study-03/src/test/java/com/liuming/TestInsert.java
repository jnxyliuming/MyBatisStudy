package com.liuming;

import com.liuming.dao.DormBuildDao;
import com.liuming.domain.DormBuild;
import com.liuming.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TestInsert {
    @Test
    public void testInsert01(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        DormBuildDao dao = sqlSession.getMapper(DormBuildDao.class);
        //创建插入的DormBuild类
        DormBuild dormBuild = new DormBuild("十二号楼","金融系",0);
        //利用代理实现
        int num = dao.insertDormBuild(dormBuild);
        System.out.println(num);
    }
}
