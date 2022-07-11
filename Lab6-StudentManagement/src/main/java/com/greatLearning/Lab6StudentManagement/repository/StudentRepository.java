package com.greatLearning.Lab6StudentManagement.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatLearning.Lab6StudentManagement.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
