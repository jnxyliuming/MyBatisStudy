package com.liuming;

import com.liuming.dao.DormBuildDao;
import com.liuming.dao.impl.DormBuildDaoImpl;
import com.liuming.domain.DormBuild;
import org.junit.Test;

public class TestInsert {
    @Test
    public void testInsert(){
        char small = 'a';
        for(int i=0;i<10;i++ ){
            System.out.println(small+i);
            String name = small+"";
            String remark = small-1+"";
            DormBuild dormBuild = new DormBuild(name,remark,1);
            DormBuildDao dormBuildDao = new DormBuildDaoImpl();
            dormBuildDao.insertDormBuild(dormBuild);
            System.out.println(small);
            small++;

        }
    }
}
