package com.example.ormspringmongodb.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document("students")
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Student {

    @Id
    private Long Id;
    private String fullName;
    private String email;
    private Date dateStart;
    private double note;
}
