package com.example.controller;

import com.example.model.TestStudent;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Jason Wong
 * @title: StudentContoller
 * @projectName mybatisdemo
 * @description: TODO
 * @date 2020/8/5 15:46
 */
@RestController
public class StudentContoller {
    @Autowired
StudentService service;
    @RequestMapping("all")
    public List<TestStudent> helloSpring(){
       return service.findAll();
    }
}
