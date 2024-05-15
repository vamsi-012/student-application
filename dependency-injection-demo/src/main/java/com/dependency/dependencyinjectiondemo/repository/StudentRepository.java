package com.dependency.dependencyinjectiondemo.repository;

import org.springframework.stereotype.Repository;

import com.dependency.dependencyinjectiondemo.model.Student;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{ 	
}
