package com.example.service;

import com.example.mapper.TestStudentMapper;
import com.example.model.TestStudent;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Jason Wong
 * @title: studentService
 * @projectName mybatisdemo
 * @description: TODO
 * @date 2020/8/5 15:47
 */
@Service
public class StudentService {

    @Resource
    TestStudentMapper testStudentMapper;
    public List<TestStudent> findAll() {

        return testStudentMapper.selectAll();
    }
}
