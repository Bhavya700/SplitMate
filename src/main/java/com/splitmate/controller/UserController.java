package com.splitmate.controller;

import com.splitmate.dto.UserResponse;
import com.splitmate.entity.User;
import com.splitmate.util.AuthUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @GetMapping("/me")
    public ResponseEntity<UserResponse> getCurrentUser() {
        User currentUser = AuthUtil.getCurrentUser();

        return ResponseEntity.ok(UserResponse.builder()
                .id(currentUser.getId())
                .name(currentUser.getName())
                .email(currentUser.getEmail())
                .build());
    }
}
