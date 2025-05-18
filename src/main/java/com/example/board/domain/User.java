package com.example.board.domain;

import jakarta.persistence.*;

@Entity // 이 클래스가 JPA 엔티티이며, DB 테이블로 매핑됨
public class User {

    @Id // 이 필드가 기본 키(PK)
    @GeneratedValue // 자동으로 기본 키 값 생성
    private Long id;

    private String username; // 사용자 이름 (로그인 ID 용도)
    private String password; // 사용자 비밀번호

    // getters and setters
}
