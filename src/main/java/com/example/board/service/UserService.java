package com.example.board.service;

import com.example.board.domain.User;
import com.example.board.repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // 사용자 등록
    public User register(User user) {
        return userRepository.save(user);
    }

    // 모든 사용자 조회
    public List<User> findAll() {
        return userRepository.findAll();
    }

    // 사용자 삭제
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
