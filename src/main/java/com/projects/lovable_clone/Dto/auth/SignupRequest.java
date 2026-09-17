package com.projects.lovable_clone.Dto.auth;

public record SignupRequest(

        String email,
        String name,
        String password
) {
}
