package com.isuru.springboot.cruddemo.dao;

import com.isuru.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// @RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
    // That's it... no need to write any code!
}
