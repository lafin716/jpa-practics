package kr.lafin.jpapractics.controller;

import kr.lafin.jpapractics.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class JpaController {

    private final MemberService memberService;

    @GetMapping("")
    public String index() {
        return "hello";
    }

    @GetMapping("/member")
    public Object member() {
        return memberService.getMembers();
    }
}
