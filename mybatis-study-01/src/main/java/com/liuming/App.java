package com.liuming;

import com.liuming.dao.DormBuildDao;
import com.liuming.domain.TbDormBuild;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {//主配置文件位置，从类路径的跟开始
        String config= "mybatis.xml";
        //读文件
        InputStream in = Resources.getResourceAsStream(config);
        //创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //创建SqlSessionFactory
        SqlSessionFactory factory = builder.build(in);
        //获取sqlSession对象，从SqlSessionFactory中获取SqlSession
        SqlSession session = factory.openSession();
        //指定要执行的sql语句标识namespace+.+id
        String sqlId = "com.liuming.dao.DormBuildDao"+"."+"selectBuilds";
        //执行一下插入语句
        String insertSql = "com.liuming.dao.DormBuildDao.insertDormBuild";
        int x = session.insert(insertSql);
        System.out.println("共插入了"+x+"行数据");//mybatis不是默认提交事务的，需要手工提交，在insert，update，delete之后要提交事务
        //提交事务
        session.commit();
        //执行sql语句通过id找到语句
         List<TbDormBuild> tbDormBuildList = session.selectList(sqlId);

        //输出结果
        tbDormBuildList.forEach(tbDormBuild -> System.out.println(tbDormBuild));
        //关闭对象
        session.close();
    }
}
