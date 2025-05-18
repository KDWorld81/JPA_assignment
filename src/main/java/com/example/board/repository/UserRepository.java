package com.example.board.repository;

import com.example.board.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
/*
 UserRepository는 사용자(User) 엔티티에 대한 데이터베이스 작업을 처리하는 JPA 리포지토리입니다.
 JpaRepository를 상속하면 CRUD 메서드가 자동으로 생성됩니다.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username); // 사용자 정의 메서드
}
