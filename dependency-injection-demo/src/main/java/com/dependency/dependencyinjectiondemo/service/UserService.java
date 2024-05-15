package com.dependency.dependencyinjectiondemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dependency.dependencyinjectiondemo.model.Student;
import com.dependency.dependencyinjectiondemo.repository.StudentRepository;

@Service
public class UserService {
	private StudentRepository studentRepository;
	
	@Autowired
	public UserService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	
	public void saveStudent(Student student) {
		studentRepository.save(student);
	}
	
	public String getUserInfo() {
		return "User Service Info";
	}
}
