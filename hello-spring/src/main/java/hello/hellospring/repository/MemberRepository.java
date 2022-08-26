package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); //멤버를 저장하고 멤버를 반환
    Optional<Member> findById(Long id); //
    Optional<Member> findByName(String name);
    List<Member> findAll();
}