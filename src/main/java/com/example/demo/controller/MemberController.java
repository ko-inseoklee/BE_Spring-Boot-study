package com.example.demo.controller;

import com.example.demo.entity.Department;
import com.example.demo.entity.Member;
import com.example.demo.service.MemberService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class MemberController {
  private final MemberService memberService;

  @MutationMapping
  public Member createMember (@Argument String name,@Argument Long depNo) {
    return memberService.createMember(name, depNo);
  }

  @QueryMapping
  public List<Member> membersByDepNo(@Argument Long depNo) {
    return memberService.membersByDepNo(depNo);
  }

}
