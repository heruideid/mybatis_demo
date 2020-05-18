package com.notorious.test;

import com.notorious.entity.Person;
import com.notorious.repository.PersonRepository;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class Test2 {
    public static void main(String[] args){
        InputStream inputStream=Test2.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory=sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();

        PersonRepository personRepository=sqlSession.getMapper(PersonRepository.class);
        Person person=personRepository.findById(1);
        person.setName("hxh");
        int result=personRepository.update(person);
        System.out.println(result);
        sqlSession.commit();
        sqlSession.close();
        //System.out.println(person.getName());
    }
}
