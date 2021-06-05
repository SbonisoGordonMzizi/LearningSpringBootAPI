package com.gordonmzizi.webapi.student;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentService {
    public ArrayList<Student> getStudent(){

        ArrayList<Student> students = new ArrayList<>();
        Student student1 = new Student(1001L,"Bob","Smith","bob@gmail.com",23);
        Student student2 = new Student(1002L,"Vice","joy","vice@gmail.com",25);
        Student student3 = new Student(1003L,"luther","bath","luther@gmail.com",21);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        return  students;
    }
}
