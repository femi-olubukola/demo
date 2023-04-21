package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner (StudentRepository studentRepository) {

        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    "mariam@gmail.com",
                    LocalDate.of(2000, SEPTEMBER, 2));

            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2004, MARCH, 2));

            Student tom = new Student(
                    "Tom",
                    "tom@gmail.com",
                    LocalDate.of(1998, JUNE, 2));

            studentRepository.saveAll(
                    List.of(mariam, alex, tom)
            );
        };
    }
}
