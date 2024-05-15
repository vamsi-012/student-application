package com.dependency.dependencyinjectiondemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dependency.dependencyinjectiondemo.component.MyComponent;
import com.dependency.dependencyinjectiondemo.model.Student;
import com.dependency.dependencyinjectiondemo.service.UserService;


@RestController
public class UserController {
	private UserService userService;
	private MyComponent myComponent;
	
	//field injection
	
//	@Autowired
//	private MyComponent myComponent;
	
	// constructor injection
	
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	//setter injection
	
	@Autowired
	public void setMyComponent(MyComponent myComponent) {
		this.myComponent = myComponent;
	}

	@GetMapping("/user")
	public String getUserInfo() {
		System.out.println(userService.getUserInfo());
		System.out.println(myComponent.getMyProperty());
		return userService.getUserInfo() + " " + myComponent.getMyProperty();
	}
	

	@PostMapping("/students")
	public String saveStudent(@RequestBody Student requestBodyStudent) {
		Student student = new Student();
		
		if (requestBodyStudent.getName() != null && !requestBodyStudent.getName().isEmpty()) {
			student.setName(requestBodyStudent.getName());
		}else {
			student.setName(myComponent.getName());
		}
		
		if (requestBodyStudent.getAge() != null) {
			student.setAge(requestBodyStudent.getAge());
		}else {
			student.setAge(requestBodyStudent.getAge());
		}
		
		userService.saveStudent(student);
		System.out.println("Student added successfully!");
		return "Student added successfully!";
	}
		
}

