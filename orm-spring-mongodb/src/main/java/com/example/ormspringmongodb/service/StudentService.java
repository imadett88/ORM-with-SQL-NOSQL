package com.example.ormspringmongodb.service;

import com.example.ormspringmongodb.model.Student;
import com.example.ormspringmongodb.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private  StudentRepo studentRepo;



    public void insertSampleData() {
        // Create a sample student
        Student student = Student.builder()
                .fullName("John Doe")
                .email("john.doe@example.com")
                .dateStart(new Date())
                .note(85.5)
                .build();

        // Insert the student into the database
        studentRepo.save(student);
    }
}
