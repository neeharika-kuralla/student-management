package com.example.student_management;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.example.student_management.model.Student;
import com.example.student_management.service.StudentService;

class StudentServiceTest {

    @Test
    void testAddStudent() {
        StudentService service = new StudentService();

        Student student = new Student(null, "Neeharika", "Neeha@example.com");

        Student result = service.addStudent(student);

        assertEquals(1L, result.getId());
        assertEquals("Neeharika", result.getName());
        assertEquals("Neeha@example.com", result.getEmail());
    }
}