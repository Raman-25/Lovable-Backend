package com.projects.lovable_clone.controller;


import com.projects.lovable_clone.Dto.auth.AuthResponse;
import com.projects.lovable_clone.Dto.auth.LoginRequest;
import com.projects.lovable_clone.Dto.auth.SignupRequest;
import com.projects.lovable_clone.Dto.auth.UserProfileResponse;
import com.projects.lovable_clone.service.AuthService;
import com.projects.lovable_clone.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {

    private AuthService authService;
    private UserService userService;

    @GetMapping("/signup")
    public ResponseEntity<AuthResponse>signup(SignupRequest request){
        return ResponseEntity.ok(authService.signup(request));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse>login(@RequestBody LoginRequest request){
        return ResponseEntity.ok(authService.login(request));
    }

    @GetMapping("/me")
    public ResponseEntity<UserProfileResponse>getProfile(){
        Long userId = 1L;
        return ResponseEntity.ok(userService.getProfile(userId));
    }
}
