package com.example.ormspringmongodb.repo;

import com.example.ormspringmongodb.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepo extends MongoRepository<Student,Long> {
}
