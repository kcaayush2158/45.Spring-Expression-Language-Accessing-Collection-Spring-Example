package com.application.main;

import com.application.model.Student;
import com.application.model.StudentListAccessor;
import org.springframework.context.support.AbstractApplicationContext;
import java.util.List;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        StudentListAccessor studentListAccessor =(StudentListAccessor)context.getBean("studentListAccessor");
        System.out.println("--------------------Third student in List -----------------------------");
        Student thirdStudnet =  studentListAccessor.getGetThirdStudentInList();
        System.out.println(thirdStudnet.getName()+"\t"+thirdStudnet.getMarks());
        System.out.println("------------ Student Name ----------------------------");
        List<String> studentName = studentListAccessor.getStudentNames();
        for(String studentname :studentName){
            System.out.println(studentname);
        }
        System.out.println("----------------------Failed Student -----------------------------------");

        List<Student> failedStudent = studentListAccessor.getFailedStudent();
        for(Student failedStudents :failedStudent){
            System.out.println(failedStudents.getName()+"\t"+failedStudents.getMarks());
        }
        context.close();
    }
}
