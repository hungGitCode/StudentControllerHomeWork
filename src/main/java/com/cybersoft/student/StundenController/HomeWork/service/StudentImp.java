package com.cybersoft.student.StundenController.HomeWork.service;

import com.cybersoft.student.StundenController.HomeWork.entity.Student;
import com.cybersoft.student.StundenController.HomeWork.model.StudentRequest;
import com.cybersoft.student.StundenController.HomeWork.repostiory.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentImp implements StudentService {
    @Autowired
    StudentRepository studentRepository;


    @Override
    public List<Student> insertByRequestParam(String name, int age) {
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        studentRepository.save(student);
        return studentRepository.findAll();
    }

    @Override
    public List<Student> insertByPathVariable(String name, int age) {
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        studentRepository.save(student);
        return studentRepository.findAll();
    }

    @Override
    public List<Student> insertByRequestBody(StudentRequest studentRequest) {
        Student student = new Student();
        student.setName(studentRequest.getName());
        student.setAge(studentRequest.getAge());
        studentRepository.save(student);
        return studentRepository.findAll();
    }
}
