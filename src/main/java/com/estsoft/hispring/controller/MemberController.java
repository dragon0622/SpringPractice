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
    //entity는 setter 사용을 지양하므로(DB 값이 바뀔 수 있으니) setter 역할만 해줄 DTO를 따로 생성하여 사용
    public List<MemberDTO> getAllMembers() {
        return memberService.getAllMembers();
    }

}