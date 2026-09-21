package com.projects.lovable_clone.service.impl;

import com.projects.lovable_clone.Dto.auth.AuthResponse;
import com.projects.lovable_clone.Dto.auth.LoginRequest;
import com.projects.lovable_clone.Dto.auth.SignupRequest;
import com.projects.lovable_clone.service.AuthService;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public  AuthResponse signup(SignupRequest request) {

        return null;
    }

    @Override
    public AuthResponse login(LoginRequest request) {

        return null;
    }
}
