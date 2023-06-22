package com.maven;

import java.util.*;
import com.maven.dao.*;
import com.maven.model.*;
public class App 
{
    public static void main( String[] args )
    {
    	StudentDao studentDao = new StudentDao();

        // test saveStudent
        Student student1 =new Student("Akshada","Chaure","akshu34@gmail.com");
        Student student2 =new Student("Ajay","Zaware","ajay66789@gmail.com");
        Student student3=new Student("Amruta","Chaure","amruta@45gmail.com");
        Student student4=new Student("Raj","Mishra","rajre12345@gmail.com");
        //passing value in parameterized constructor
        studentDao.saveStudent(student1);
        studentDao.saveStudent(student2);
        studentDao.saveStudent(student3);
        studentDao.saveStudent(student4);
        
        // test updateStudent
        student2.setFirstName("Saniya");
        studentDao.updateStudent(student2);
        
        student3.setFirstName("Manoj");
        studentDao.updateStudent(student3);
        
        student4.setFirstName("Abhi");
        studentDao.updateStudent(student4);
        
        student4.setLastName("Kumar");
        studentDao.updateStudent(student4);
        
        student4.setEmail("raj67a@gmail.com");
        studentDao.updateStudent(student4);
       
        // test getAllStudents
        List < Student > students = studentDao.getAllStudents();
        System.out.println("List of the students:"); 
        students.forEach(student-> System.out.println("Student Id:"+student.getId()+"    " +"Name:"+student.getFirstName()+"  "+"Email:"+student.getEmail()));
        // -> lambda expression left side of arrow:parameter ; right:value
         // test getStudentById
//        Student student12 = studentDao.getStudentById(students.getId());
        
        // test deleteStudent
        studentDao.deleteStudent(1);
        

    }


	}
    



