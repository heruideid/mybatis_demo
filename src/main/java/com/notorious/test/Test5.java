package com.notorious.test;

import com.notorious.entity.Student;
import com.notorious.repository.StudentRepository;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class Test5 {
    public static void main(String[] args) {
        InputStream inputStream=Test2.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory=sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        StudentRepository studentRepository=sqlSession.getMapper(StudentRepository.class);
        Student student=new Student(0,"lzy",null);
        System.out.println(studentRepository.findByStudent(student));
    }


}
