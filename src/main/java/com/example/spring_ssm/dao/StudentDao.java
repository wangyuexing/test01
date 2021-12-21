package com.example.spring_ssm.dao;

import com.example.spring_ssm.domain.Student;

import java.util.List;

public interface StudentDao {
    int insertStudent(Student student);
    List<Student> selectStudent();
}
