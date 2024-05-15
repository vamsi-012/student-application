package com.dependency.dependencyinjectiondemo.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {
	@Value("${my.property:Default value}")
	private String myProperty;
	
	@Value("${name:vamsi}")
	private String name;
	
	@Value("${age:23}")
	private int age;
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getMyProperty() {
		return myProperty;
	}
}
