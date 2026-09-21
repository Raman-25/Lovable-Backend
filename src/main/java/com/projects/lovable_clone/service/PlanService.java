package com.projects.lovable_clone.service;

import com.projects.lovable_clone.Dto.Subscription.PlanResponse;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface PlanService {

    @Nullable List<PlanResponse> getAllActivePlans();
}
