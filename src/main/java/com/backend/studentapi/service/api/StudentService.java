package com.backend.studentapi.service.api;

import com.backend.studentapi.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student getStudentById(int id);
}
