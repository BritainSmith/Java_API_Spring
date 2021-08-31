package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

// directing to localhost:8080/api/vi/student
@RequestMapping(path = "api/v1/student")


public class StudentController {

    private final StudentService studentService;

    // this studentService will be auto wired / instantiated.
    @Autowired

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }
}
