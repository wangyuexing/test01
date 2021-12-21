package com.example.spring_ssm.service.impl;

import com.example.spring_ssm.dao.StudentDao;
import com.example.spring_ssm.domain.Student;
import com.example.spring_ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao dao;
    @Override
    public int addStudent(Student student) {
        return dao.insertStudent(student);
    }

    @Override
    public List<Student> showStudent() {
        return dao.selectStudent();
    }
}
