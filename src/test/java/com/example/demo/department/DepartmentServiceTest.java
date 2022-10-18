package com.example.demo.department;

import com.example.demo.repository.DepartmentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.tester.AutoConfigureGraphQlTester;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.graphql.test.tester.GraphQlTester;

@SpringBootTest
@AutoConfigureGraphQlTester
public class DepartmentServiceTest {
  @Autowired
  private GraphQlTester graphQlTester;

  @Autowired
  private DepartmentRepository departmentRepository;

  @Test
  void get_department_test() throws Exception {
    graphQlTester.documentName("getDepartment")
        .variable("id", 1)
        .execute()
        .path("getDepartment.name")
        .entity(String.class)
        .isEqualTo("플랫폼개발팀");
  }
}
