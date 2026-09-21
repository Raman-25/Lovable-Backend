package com.projects.lovable_clone.service;

import com.projects.lovable_clone.Dto.auth.AuthResponse;
import com.projects.lovable_clone.Dto.auth.LoginRequest;
import com.projects.lovable_clone.Dto.auth.SignupRequest;
import org.jspecify.annotations.Nullable;

public interface AuthService {

    @Nullable AuthResponse signup(SignupRequest request);

    @Nullable AuthResponse login(LoginRequest request);
}
