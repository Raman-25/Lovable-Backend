package com.projects.lovable_clone.service;

import com.projects.lovable_clone.Dto.auth.UserProfileResponse;
import org.jspecify.annotations.Nullable;

public interface UserService {

    @Nullable UserProfileResponse getProfile(Long userId);
}
