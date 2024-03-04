package com.estsoft.hispring.service;

import com.estsoft.hispring.controller.Member;
import com.estsoft.hispring.repository.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberService {
    private MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public List<Member> getAllMembers() {


        List<Member> all = memberRepository.findAll();
        System.out.println();
        return all;
    }
}
