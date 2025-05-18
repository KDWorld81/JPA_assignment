package com.example.board.controller;

import com.example.board.domain.User;
import com.example.board.service.UserService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController // 이 클래스가 REST API 컨트롤러임을 나타냄
@RequestMapping("/users") // 이 컨트롤러에서 처리할 기본 URL 경로
public class UserController {

    private final UserService userService;

    // 생성자를 통한 의존성 주입 (UserService 객체를 외부에서 주입받음)
    public UserController(UserService userService) {this.userService = userService;}

    // 사용자 등록(회원가입) 요청 처리
    @PostMapping
    public User register(@RequestBody User user) {
        // 요청 본문에 담긴 JSON 데이터를 User 객체로 변환하여 등록
        return userService.register(user);
    }

    // 전체 사용자 목록 조회 요청 처리
    @GetMapping
    public List<User> allUsers() {
        // 모든 사용자 목록을 서비스로부터 조회하여 반환
        return userService.findAll();
    }

    // 특정 사용자 삭제 요청 처리
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        // URL 경로에서 전달된 사용자 ID 값을 기반으로 해당 사용자 삭제
        userService.delete(id);
    }
}
