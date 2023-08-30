package com.klinnovations.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klinnovations.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
