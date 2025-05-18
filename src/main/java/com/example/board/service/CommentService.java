package com.example.board.service;

import com.example.board.domain.Comment;
import com.example.board.repository.CommentRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service // 이 클래스가 서비스 계층의 컴포넌트임을 나타냄 (Spring이 자동으로 Bean으로 등록)
public class CommentService {
    private final CommentRepository commentRepository;

    // 생성자를 통한 의존성 주입
    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    // 댓글 저장 (생성)
    public Comment create(Comment comment) {
        return commentRepository.save(comment);
    }

    // 모든 댓글 조회
    public List<Comment> findAll() {
        return commentRepository.findAll();
    }

    // 댓글 삭제
    public void delete(Long id) {
        commentRepository.deleteById(id);
    }
}
