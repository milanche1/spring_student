package com.example.demo.service;

import com.example.demo.model.Student;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentsService {
    public List<Student> getStudents() {
        return List.of(
                new Student(1, "Milan", "milan@ex.com", 23, LocalDate.now()),
                new Student(1, "Milan", "milan@ex.com", 23, LocalDate.now()),
                new Student(1, "Milan", "milan@ex.com", 23, LocalDate.now())
        );
    }
}
