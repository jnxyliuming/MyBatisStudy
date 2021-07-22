package com.liuming;

import com.liuming.dao.DormBuildDao;
import com.liuming.dao.impl.DormBuildDaoImpl;
import com.liuming.domain.DormBuild;
import org.junit.Test;

import java.util.List;

public class TestSelect {
    @Test
    public void testSelect01(){
        DormBuildDao dormBuildDao;
        dormBuildDao = new DormBuildDaoImpl();
        List<DormBuild> dormBuilds = dormBuildDao.selectDormBuild();
        for (DormBuild dormbuild:
             dormBuilds) {
            System.out.println(dormbuild.toString());
        }
    }
}
