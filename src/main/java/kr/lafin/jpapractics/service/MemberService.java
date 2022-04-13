package kr.lafin.jpapractics.service;

import kr.lafin.jpapractics.entity.Member;
import kr.lafin.jpapractics.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository repository;

    public List<Member> getMembers() {
        return repository.findAll();
    }
}
