package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mysql.cj.x.protobuf.MysqlxCrud.Insert;
import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Application is started...." );
        
        // using xml config 
        
        //ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        
        //using jdbcconfig
        
        ApplicationContext context=new AnnotationConfigApplicationContext(JdbcConfig.class);
        
        StudentDaoImpl studentDaoImpl=context.getBean("studentDao", StudentDaoImpl.class);
        
       //insert
        
//        Student student=new Student(444, "bbbb", "hhhh");
//        int result=studentDaoImpl.insert(student);
//        System.out.println("number of row added is---"+result);
        
        
        //update
        
//        Student student=new Student(444, "xxxxx", "yyyyy");
//        int result=studentDaoImpl.updateStu(student);
//        System.out.println("number of row updated is---"+result);
        
        
        //Delete
        
//        int result=studentDaoImpl.delete(444);
//        System.out.println("number of row delete is= "+result);
        
        //featching single student data
        
//        Student student=studentDaoImpl.getStudent(12);
//        System.out.println(student);
//        
        
        //fecching all student data
        List<Student> students=studentDaoImpl.getAllStudents();
        for(Student s:students) {
        	System.out.println(s);
        }
       
        
    }
}
