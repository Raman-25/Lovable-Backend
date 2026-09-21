package com.projects.lovable_clone.service.impl;

import com.projects.lovable_clone.Dto.auth.UserProfileResponse;
import com.projects.lovable_clone.service.UserService;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public  UserProfileResponse getProfile(Long userId) {
        return null;
    }
}
