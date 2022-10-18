package com.example.demo.service;

import com.example.demo.entity.Department;
import com.example.demo.entity.Member;
import com.example.demo.repository.DepartmentRepository;
import com.example.demo.repository.MemberRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
  private final MemberRepository memberRepository;


  public MemberService(MemberRepository memberRepository) {
    this.memberRepository = memberRepository;
  }

  public List<Member> membersByDepNo(Long depNo) {
    return memberRepository.findByDepNo(depNo);
  }



  public Member createMember(String name, Long depNo){
    return memberRepository.save(Member.from(name, depNo));
  }
}
