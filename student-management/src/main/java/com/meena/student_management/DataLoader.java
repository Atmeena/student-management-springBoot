package com.meena.student_management;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.meena.student_management.model.Student;
import com.meena.student_management.repository.StudentRepository;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner loadData(StudentRepository repository) {
        return args -> {
            repository.save(new Student(null, "Meena", "meena@gmail.com", "MCA"));
        };
    }
}
