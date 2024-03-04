package com.estsoft.hispring.repository;

import com.estsoft.hispring.controller.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//JPA
//member 테이블에 접근해서 Member 클래스에 매핑하는 구현체

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

}
