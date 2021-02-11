package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.APRIL;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student diesel = new Student(1L, "Diesel", "d@dog.com", 6, LocalDate.of(2000,APRIL, 3)
                        );
            Student alex = new Student(2L, "Alex", "alex@gmail.com", 36, LocalDate.of(2000,APRIL, 3)
            );

            repository.saveAll(List.of(diesel, alex));
        };
    }
}
