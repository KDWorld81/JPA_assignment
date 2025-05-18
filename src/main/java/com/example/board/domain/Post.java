package com.example.board.domain;

import jakarta.persistence.*;

@Entity // 이 클래스가 JPA 엔티티이며, DB 테이블로 매핑됨
public class Post {

    @Id // 이 필드가 기본 키(PK)
    @GeneratedValue // 자동으로 기본 키 값 생성
    private Long id;

    private String title;  // 게시글 제목
    private String content; // 게시글 본문 내용

    @ManyToOne // 여러 게시글이 하나의 작성자(User)에 속함 (N:1 관계)
    private User author;

    // getters and setters (생략 롬복이나 IDE로 자동 생성 가능함)
}
