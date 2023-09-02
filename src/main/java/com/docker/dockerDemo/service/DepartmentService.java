package com.docker.dockerDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.docker.dockerDemo.entity.Department;
import com.docker.dockerDemo.repo.DepartmentDao;

@Service
public class DepartmentService {
	@Autowired
	DepartmentDao dao;
	
		
	
	public Department saveDepartment(Department d) {
		dao.save(d);
		return d;
	}

	public List<Department> getDeparments() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	public Department getDepartmentById(Integer id) {
		// TODO Auto-generated method stub
		
		return dao.findById(id).get();
	}

}
