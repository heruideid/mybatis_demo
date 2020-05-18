package com.notorious.test;
import com.notorious.entity.Person;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class Test {
    public static void main(String[] args){
        //加载MyBatis配置文件
        InputStream inputStream=Test.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory=sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        String statement="com.notorious.mapper.PersonMapper.save";
        Person person=new Person("herui",4);
        sqlSession.insert(statement,person);
        sqlSession.commit();
    }
}
