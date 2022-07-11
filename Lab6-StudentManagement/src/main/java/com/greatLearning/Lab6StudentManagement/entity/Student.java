package com.greatLearning.Lab6StudentManagement.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name = "students")
@Data
public class Student {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;

	@Column
	private String firstName;

	@Column
	private String lastName;

	@Column
	private String course;

	@Column
	private String country;

	public Student(String firstName, String lastName, String course, String country) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
		this.country = country;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

}
