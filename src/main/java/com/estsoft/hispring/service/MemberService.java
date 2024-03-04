package com.estsoft.hispring.service;

import com.estsoft.hispring.controller.Member;
import com.estsoft.hispring.controller.MemberDTO;
import com.estsoft.hispring.repository.MemberRepository;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberService {
    private MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public List<MemberDTO> getAllMembers() {


        List<Member> memberList = memberRepository.findAll();
        System.out.println("memberList = " + memberList);
        List<MemberDTO> resultList = memberList.stream()
                .map(member -> new MemberDTO(member.getId(), member.getName())).toList();

        return resultList;
    }
}
