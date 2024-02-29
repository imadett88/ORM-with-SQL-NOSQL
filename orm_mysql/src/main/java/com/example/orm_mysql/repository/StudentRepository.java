package com.example.orm_mysql.repository;

import com.example.orm_mysql.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
