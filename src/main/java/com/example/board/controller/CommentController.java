package com.example.board.controller;

import com.example.board.domain.Comment;
import com.example.board.service.CommentService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController  // 이 클래스가 REST API 컨트롤러임을 나타냄
@RequestMapping("/comments")  // 이 컨트롤러에서 처리할 기본 URL 경로
public class CommentController {

    private final CommentService commentService;

    // 생성자를 통한 의존성 주입 (CommentService를 주입받음)
    public CommentController(CommentService commentService) {this.commentService = commentService;}

    // 댓글 생성 요청 처리
    @PostMapping
    public Comment create(@RequestBody Comment comment) {
        // 클라이언트에서 받은 JSON 데이터를 Comment 객체로 변환하여 서비스 계층에 전달
        return commentService.create(comment);
    }

    // 모든 댓글 조회 요청 처리
    @GetMapping
    public List<Comment> allComments() {
        // 서비스에서 전체 댓글 목록을 받아 반환
        return commentService.findAll();
    }

    // 특정 댓글 삭제 요청 처리
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        // 변수(id)를 받아 해당 ID의 댓글을 삭제
        commentService.delete(id);
    }
}
