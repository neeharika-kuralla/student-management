package com.example.student_management.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.student_management.model.Student;

@Service
public class StudentService {

    private final List<Student> students = new ArrayList<>();

    public List<Student> getAllStudents() {
        return students;
    }

    public Student addStudent(Student student) {
        student.setId((long) (students.size() + 1));
        students.add(student);
        return student;
    }
}