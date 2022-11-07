package com.cybersoft.student.StundenController.HomeWork.controller;

import com.cybersoft.student.StundenController.HomeWork.model.StudentRequest;
import com.cybersoft.student.StundenController.HomeWork.service.StudentService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
public class StudenController {

    @Autowired
    StudentService studentService;
    ObjectMapper om = new ObjectMapper();

    @GetMapping("/RequestParam")
    public Object insertByRequestParam(
            @RequestParam("name") String name,
            @RequestParam("age") int age) throws JsonProcessingException {
//        String json = om.writeValueAsString(studentService.insertByRequestParam(name,age));
//        System.out.println(json);
       return studentService.insertByRequestParam(name,age);
    }

    @PostMapping("/{name}/{age}")
    public Object insertByPathVariable(
            @PathVariable("name") String name,
            @PathVariable("age") int age){
        return studentService.insertByRequestParam(name,age);
    }

    @PostMapping("/insertByRequestBody")
    public Object insertByRequestBody(@RequestBody StudentRequest studentRequest){
        return studentService.insertByRequestBody(studentRequest);
    }

}
