package com.estsoft.hispring.controller;

import com.estsoft.hispring.service.MemberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {  // 빈 주입
        this.memberService = memberService;
    }

    @GetMapping("/members")
    @ResponseBody // RestController 를 붙여준 것과 같은 ㅎ과
    public List<Member> getAllMembers() {
        return memberService.getAllMembers();
    }
}