package com.projects.lovable_clone.Dto.auth;

public record AuthResponse(

        String token,
        UserProfileResponse user

){
}
