package com.example.demo.controller;

import com.example.demo.entity.Department;
import com.example.demo.entity.Member;
import com.example.demo.service.DepartmentService;
import java.util.List;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class DepartmentController {
  private final DepartmentService departmentService;

  public DepartmentController(DepartmentService departmentService) {
    this.departmentService = departmentService;
  }

  @SchemaMapping
  public Department department (Member member) {
    return departmentService.getDepartment(member.getDepNo());
  }

  @MutationMapping
  public Department createDepartment (@Argument String name) {
    return departmentService.createDepartment(name);
  }

  @QueryMapping
  public List<Department> departments() {
    return departmentService.departments();
  }


  @QueryMapping
  public Department getDepartment(@Argument Long id) {
    return departmentService.getDepartment(id);
  }

}
