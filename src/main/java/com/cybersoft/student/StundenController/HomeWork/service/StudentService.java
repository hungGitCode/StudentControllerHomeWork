package com.cybersoft.student.StundenController.HomeWork.service;

import com.cybersoft.student.StundenController.HomeWork.entity.Student;
import com.cybersoft.student.StundenController.HomeWork.model.StudentRequest;

import java.util.List;


public interface StudentService {
    public List<Student> insertByRequestParam(String name, int age);
    public List<Student> insertByPathVariable(String name, int age);
    public List<Student> insertByRequestBody(StudentRequest studentRequest);
}
