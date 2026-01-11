package com.backend.studentapi.service.impl;

import com.backend.studentapi.model.Student;
import com.backend.studentapi.service.api.StudentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InMemoryStudentService implements StudentService {

    private final List<Student> students = List.of(
            new Student(1, "Alex", 10),
            new Student(2, "poex", 12),
            new Student(3, "Alpx", 11)
    );


    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Student getStudentById(int id) {
        return students.stream().filter(student -> student.getId()
                == id).findFirst().orElse(null);
    }
}

