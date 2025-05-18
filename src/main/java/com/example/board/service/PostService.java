package com.example.board.service;

import com.example.board.domain.Post;
import com.example.board.repository.PostRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PostService {
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    // 게시글 저장 (생성)
    public Post create(Post post) {
        return postRepository.save(post);
    }

    // 모든 게시글 조회
    public List<Post> findAll() {
        return postRepository.findAll();
    }

    // 게시글 삭제
    public void delete(Long id) {
        postRepository.deleteById(id);
    }
}
