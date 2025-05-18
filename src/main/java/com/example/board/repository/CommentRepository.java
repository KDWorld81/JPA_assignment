package com.example.board.repository;

import com.example.board.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

/*
 CommentRepository는 댓글(Comment) 엔티티에 대한 데이터베이스 작업을 처리하는 JPA 리포지토리입니다.
 JpaRepository를 상속하면 CRUD 메서드가 자동으로 생성됩니다.
 */
public interface CommentRepository extends JpaRepository<Comment, Long> {
    // 별도의 메서드 없이도 기본적인 CRUD(create, read, update, delete) 작업이 가능함

}
