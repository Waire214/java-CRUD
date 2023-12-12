package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student(
                1L, 
                "Mariam",
                "mariam@yopmail.com",
                LocalDate.of(2001, Month.JANUARY, 5)
            );
            Student alex = new Student(
                2L, 
                "Alex",
                "alex@yopmail.com",
                LocalDate.of(2002, Month.JANUARY, 5)
            );

            repository.saveAll(List.of(mariam, alex));
        };
    }
}
