package com.greatLearning.Lab6StudentManagement.service;

import java.util.List;

import com.greatLearning.Lab6StudentManagement.entity.Student;

public interface StudentService {

	public List<Student> findAll();

	public Student findById(int theId);

	public void save(Student theStudent);

	public void deleteById(int theId);

}
