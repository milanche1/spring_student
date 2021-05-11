package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentsService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentsService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
//        return List.of(
//                new Student(1, "Milan", "milan@ex.com", 23, LocalDate.now()),
//                new Student(1, "Milan", "milan@ex.com", 23, LocalDate.now()),
//                new Student(1, "Milan", "milan@ex.com", 23, LocalDate.now())
//        );
        return studentRepository.findAll();
    }
}
