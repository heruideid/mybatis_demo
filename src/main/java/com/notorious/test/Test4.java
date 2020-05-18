package com.notorious.test;

import com.notorious.entity.Student;
import com.notorious.repository.StudentRepository;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class Test4 {
    public static void main(String[] args){
        InputStream inputStream=Test2.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory=sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();


        StudentRepository studentRepository=sqlSession.getMapper(StudentRepository.class);
        Student student=studentRepository.findById(1);
        System.out.println(student);
        //一级缓存测试
//        Student student2=studentRepository.findById(1);
//        System.out.println(student2);
        sqlSession.close();

        //测试二级缓存
        SqlSession sqlSession1=sqlSessionFactory.openSession();
        StudentRepository studentRepository1=sqlSession1.getMapper(StudentRepository.class);
        Student student1=studentRepository1.findById(1);
        System.out.println(student1);
        sqlSession1.close();
    }
}
