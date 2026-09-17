package com.projects.lovable_clone.Dto.auth;

public record UserProfileResponse(
        Long id,
        String name,
        String email,
        String avatarUrl
) {
}
