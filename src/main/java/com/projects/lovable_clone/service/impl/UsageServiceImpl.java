package com.projects.lovable_clone.service.impl;

import com.projects.lovable_clone.Dto.Usage.PlanLimitResponse;
import com.projects.lovable_clone.Dto.Usage.UsageTodayResponse;
import com.projects.lovable_clone.service.UsageService;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

@Service
public class UsageServiceImpl implements UsageService {

    @Override
    public @Nullable UsageTodayResponse getTodayUsageOfUser(long userId) {
        return null;
    }

    @Override
    public @Nullable PlanLimitResponse getCurrentSubscriptionLimitOfUser(long userId) {
        return null;
    }
}
