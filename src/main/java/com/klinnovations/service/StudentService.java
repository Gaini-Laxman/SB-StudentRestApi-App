package com.klinnovations.service;

import java.util.List;
import java.util.Optional;

import com.klinnovations.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
    Optional<Student> getStudentById(Integer id);
    Student createStudent(Student student);
    Optional<Student> updateStudent(Integer id, Student student);
    boolean deleteStudent(Integer id);

}
