package com.example.demo.repository;

import com.example.demo.entity.Department;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

  @Override
  Optional<Department> findById(Long aLong);
}