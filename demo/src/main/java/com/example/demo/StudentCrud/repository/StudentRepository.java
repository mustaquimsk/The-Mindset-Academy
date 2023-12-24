package com.example.demo.StudentCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.StudentCrud.domain.Student;

@Repository
public interface StudentRepository  extends JpaRepository<Student, Long>{

}
