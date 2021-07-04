package hello.hellospring.repository;

import java.util.List;
import java.util.Optional;

import hello.hellospring.domain.Member;

public interface MemberRepository {
    Member save(Member member); // 회원 저장

    Optional<Member> findById(Long id); // id로 찾기

    Optional<Member> findByName(String name); // 이름으로 찾기

    List<Member> findAll();

}
