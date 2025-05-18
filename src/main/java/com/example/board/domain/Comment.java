package com.example.board.domain;

import jakarta.persistence.*;

@Entity // 이 클래스가 JPA 엔티티임을 선언. DB 테이블로 매핑됨
public class Comment {

    @Id // 기본 키(PK) 필드임을 지정
    @GeneratedValue // 자동으로 ID 값을 생성 (기본 전략: AUTO)
    private Long id;

    private String content; // 댓글 내용

    @ManyToOne // N:1 관계 (여러 개의 댓글이 하나의 게시글(Post)에 속함)
    private Post post;

    @ManyToOne // N:1 관계 (여러 개의 댓글이 하나의 사용자(User)에 속함)
    private User author;

    // getters and setters (생략 롬복이나 IDE를 통해 자동 생성 가능함)
}
