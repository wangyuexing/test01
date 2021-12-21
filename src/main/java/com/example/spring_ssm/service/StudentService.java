package com.example.spring_ssm.service;

import com.example.spring_ssm.domain.Student;

import java.util.List;

public interface StudentService {
    int addStudent(Student student);
    List<Student> showStudent();
}
