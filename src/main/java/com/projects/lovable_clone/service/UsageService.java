package com.projects.lovable_clone.service;

import com.projects.lovable_clone.Dto.Usage.PlanLimitResponse;
import com.projects.lovable_clone.Dto.Usage.UsageTodayResponse;
import org.jspecify.annotations.Nullable;

public interface UsageService {

    @Nullable UsageTodayResponse getTodayUsageOfUser(long userId);

    @Nullable PlanLimitResponse getCurrentSubscriptionLimitOfUser(long userId);
}
