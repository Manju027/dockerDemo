package com.docker.dockerDemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.docker.dockerDemo.entity.Department;

@Repository
public interface DepartmentDao extends JpaRepository<Department, Integer>{

}
