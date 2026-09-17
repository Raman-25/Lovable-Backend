package com.projects.lovable_clone.service;

import com.projects.lovable_clone.Dto.Usage.PlanLimitResponse;
import com.projects.lovable_clone.Dto.Usage.UsageTodayResponse;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

@Service
public class UsageService {
    public @Nullable UsageTodayResponse getTodayUsageOfUser(long userId) {
    }

    public @Nullable PlanLimitResponse getCurrentSubscriptionLimitOfUser(long userId) {
    }
}
