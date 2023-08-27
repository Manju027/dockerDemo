package com.docker.dockerDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.docker.dockerDemo.entity.Department;
import com.docker.dockerDemo.service.DepartmentService;

@RestController
public class DepartmentController {
	
	@Autowired
	DepartmentService service;
	
	@Value("${env.from.docker}")
	String dockerEnv;
	
	
	
	@GetMapping("/hello")
	public String helloWorld() {
		
		return "Hello "+ dockerEnv;
		
	}
	
	@PostMapping("/departments")
	public ResponseEntity<Department> helloWorld(@RequestBody Department d) {
		
		Department savedd= service.saveDepartment(d);
		return new ResponseEntity<>(savedd,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/departments")
	public ResponseEntity<List<Department>> getDepartments(){
		
		List<Department> departments= service.getDeparments();
		
		return new ResponseEntity<>(departments,HttpStatus.OK);
	}
	
	@GetMapping("/departments/{id}")
	public ResponseEntity<Department> getDepartmentByID(@PathVariable Integer id){
		
		Department department = service.getDepartmentById(id);
		
		return new ResponseEntity<>(department,HttpStatus.OK);
	}

}
