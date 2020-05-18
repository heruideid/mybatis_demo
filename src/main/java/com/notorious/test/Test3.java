package com.notorious.test;

import com.notorious.entity.Person;
import com.notorious.entity.Student;
import com.notorious.repository.ClassRepository;
import com.notorious.repository.PersonRepository;
import com.notorious.repository.StudentRepository;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.sql.SQLOutput;

public class Test3 {
    public static void main(String[] args){
        InputStream inputStream=Test2.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory=sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();

        //多对一，多个学生对应一个班级
//        StudentRepository personRepository=sqlSession.getMapper(StudentRepository.class);
//        //Student person=personRepository.findById(1);
//        System.out.println(personRepository.findById(1));
        //一对多,一个班级对应多个学生
//        ClassRepository classRepository=sqlSession.getMapper(ClassRepository.class);
//        System.out.println(classRepository.findById(1));
        StudentRepository studentRepository=sqlSession.getMapper(StudentRepository.class);
        Student  student=studentRepository.findByIdLazy(1);
        System.out.println(student.getId());
        System.out.println("-------");
        System.out.println(student.getaClass());
    }
}
