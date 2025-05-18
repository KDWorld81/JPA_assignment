package com.example.board.controller;

import com.example.board.domain.Post;
import com.example.board.service.PostService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController // 이 클래스가 REST API 컨트롤러임을 나타냄
@RequestMapping("/posts") // 이 컨트롤러에서 처리할 기본 URL 경로
public class PostController {

    private final PostService postService;

    // 생성자를 통한 의존성주입 (PostService를 주입받음)
    public PostController(PostService postService) {
        this.postService = postService;
    }

    // 게시글 생성 요청 처리
    @PostMapping
    public Post create(@RequestBody Post post) {
        // 요청 본문(Request Body)에 담긴 JSON 데이터를 Post 객체로 변환하여 저장
        return postService.create(post);
    }

    // 전체 게시글 조회 요청 처리
    @GetMapping
    public List<Post> allPosts() {
        // 저장된 모든 게시글을 반환
        return postService.findAll();
    }

    // 특정 게시글 삭제 요청 처리
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        // URL 경로에서 받은 ID 값을 이용해 게시글 삭제
        postService.delete(id);
    }
}
