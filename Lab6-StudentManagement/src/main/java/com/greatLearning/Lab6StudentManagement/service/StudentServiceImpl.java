package com.greatLearning.Lab6StudentManagement.service;

import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.greatLearning.Lab6StudentManagement.entity.Student;
import com.greatLearning.Lab6StudentManagement.repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		List<Student> Students = studentRepository.findAll();
		return Students;
	}

	@Override
	public Student findById(int theId) {
		// TODO Auto-generated method stub
		return studentRepository.findById(theId).get();
	}

	@Override
	public void save(Student theStudent) {
		// TODO Auto-generated method stub
		studentRepository.save(theStudent);

	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(theId);

	}

}