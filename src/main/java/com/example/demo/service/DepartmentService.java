package com.example.demo.service;

import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

  private final DepartmentRepository departmentRepository;

  public DepartmentService(DepartmentRepository departmentRepository) {
    this.departmentRepository = departmentRepository;
  }

  public Department createDepartment(String name){
    return departmentRepository.save(Department.from(name));
  }

  public List<Department> departments() {
    return departmentRepository.findAll();
  }

  public Department getDepartment(Long id) {
    Optional<Department> result = departmentRepository.findById(id);
    return result.isPresent()? result.get() : result.orElseThrow();
  }
}
