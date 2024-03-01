package com.example.ormspringmongodb.controller;


import com.example.ormspringmongodb.model.Student;
import com.example.ormspringmongodb.repo.StudentRepo;
import com.example.ormspringmongodb.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private StudentService studentService;

    @PostMapping("/insert-test")
    public String insertTestStudent(){
        studentService.insertSampleData();
        return "Sample student inserted successfully!";
    }


//    @GetMapping
//    public List<Student> getAllStudents() {
//        return studentRepo.findAll();
//    }


}
