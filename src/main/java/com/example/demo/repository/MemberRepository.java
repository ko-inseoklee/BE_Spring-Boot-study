package com.example.demo.repository;

import com.example.demo.entity.Member;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

  List<Member> findByDepNo(Long depNo);

}