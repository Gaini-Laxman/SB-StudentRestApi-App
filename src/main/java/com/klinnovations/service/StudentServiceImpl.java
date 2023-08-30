package com.klinnovations.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klinnovations.entity.Student;
import com.klinnovations.repository.StudentRepository;


@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
    private StudentRepository studentRepo;
	
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}

	@Override
	public Optional<Student> getStudentById(Integer id) {
		// TODO Auto-generated method stub
		return studentRepo.findById(id);
	}

	@Override
	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}

	@Override
	public Optional<Student> updateStudent(Integer id, Student student) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean deleteStudent(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

}
