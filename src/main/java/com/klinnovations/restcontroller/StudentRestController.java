package com.klinnovations.restcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klinnovations.entity.Student;
import com.klinnovations.repository.StudentRepository;

@RestController
@RequestMapping("/api/v1")
public class StudentRestController {

    @Autowired
    private StudentRepository studentRepo;

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = studentRepo.findAll();
        return ResponseEntity.ok(students);
    }

    @GetMapping("/students/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Integer id) {
        Optional<Student> optionalStudent = studentRepo.findById(id);
        if (optionalStudent.isPresent()) {
            return ResponseEntity.ok(optionalStudent.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/students")
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        Student createdStudent = studentRepo.save(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdStudent);
    }

    @PutMapping("/students/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Integer id, @RequestBody Student student) {
        if (!studentRepo.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        student.setId(id);
        Student updatedStudent = studentRepo.save(student);
        return ResponseEntity.ok(updatedStudent);
    }

    @DeleteMapping("/students/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Integer id) {
        if (!studentRepo.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        studentRepo.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
