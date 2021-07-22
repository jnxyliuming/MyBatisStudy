package com.liuming;

import com.liuming.domain.TbDormBuild;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestInsert {
    @Test
    public void testInert01() throws IOException {
        String config= "mybatis.xml";
        //读文件
        InputStream in = Resources.getResourceAsStream(config);
        //创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //创建SqlSessionFactory
        SqlSessionFactory factory = builder.build(in);
        //获取sqlSession对象，从SqlSessionFactory中获取SqlSession
        SqlSession session = factory.openSession(true);

        //执行一下插入语句
        String insertSql = "com.liuming.dao.DormBuildDao.insertDormBuild";
        int x = session.insert(insertSql);
        System.out.println("共插入了"+x+"行数据");
        //已经设置自动提交
        //提交事务
//        session.commit();

        //插入完成之后进行查询

        //指定要执行的sql语句标识namespace+.+id
        String sqlId = "com.liuming.dao.DormBuildDao"+"."+"selectBuilds";
        //执行sql语句通过id找到语句
        List<TbDormBuild> tbDormBuildList = session.selectList(sqlId);

        //输出结果
        tbDormBuildList.forEach(tbDormBuild -> System.out.println(tbDormBuild));
        //关闭对象
        session.close();
    }
    //以上是对死的插入方式进行插入，下面是灵活的带参数的插入方式
    @Test
    public void TestInsert02() throws IOException {
            String config= "mybatis.xml";
            //读文件
            InputStream in = Resources.getResourceAsStream(config);
            //创建SqlSessionFactoryBuilder对象
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            //创建SqlSessionFactory
            SqlSessionFactory factory = builder.build(in);
            //获取sqlSession对象，从SqlSessionFactory中获取SqlSession
            SqlSession session = factory.openSession(true);

            //执行一下插入语句
            String insertSql = "com.liuming.dao.DormBuildDao.insertDormBuildByClass";
            TbDormBuild tbDormBuild = new TbDormBuild("男生宿舍","外语系1",0);
            System.out.println(tbDormBuild.toString());
            int x = session.insert(insertSql,tbDormBuild);
            System.out.println("共插入了"+x+"行数据");
            //插入完成之后进行事务提交
            //session.commit();
            //插入完成之后进行查询
            String sqlId = "com.liuming.dao.DormBuildDao"+"."+"selectBuilds";
            //执行sql语句通过id找到语句
            List<TbDormBuild> tbDormBuildList = session.selectList(sqlId);
            //输出结果
            tbDormBuildList.forEach(tbDormBuildI -> System.out.println(tbDormBuildI));
            //关闭对象
            session.close();
        }

    }


