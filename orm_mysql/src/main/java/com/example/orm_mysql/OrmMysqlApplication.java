package com.example.orm_mysql;

import com.example.orm_mysql.model.Student;
import com.example.orm_mysql.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class OrmMysqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrmMysqlApplication.class, args);
    }


    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
          studentRepository.saveAll(
                  List.of(
                          Student.builder().fullName("Imad Ettamen").email("imadett@emsi.ma").dateStart(new Date()).phone("0712345666").note(15.44).build(),
                          Student.builder().fullName("Abdo Ettamen").email("abdoett@emsi.ma").dateStart(new Date()).phone("0712345666").note(17.44).build(),
                          Student.builder().fullName("Aya Salii").email("ayaett@emsi.ma").dateStart(new Date()).phone("0712345666").note(12.44).build()
                  )
          );

          studentRepository.findAll().forEach(s->{
              System.out.println(s.getFullName());
          });
        };
    }

}
