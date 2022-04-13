package kr.lafin.jpapractics.repository;


import kr.lafin.jpapractics.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
