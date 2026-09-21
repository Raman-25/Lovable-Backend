package com.projects.lovable_clone.service.impl;

import com.projects.lovable_clone.Dto.Subscription.PlanResponse;
import com.projects.lovable_clone.service.PlanService;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanServiceImpl implements PlanService {

    @Override
    public  List<PlanResponse> getAllActivePlans() {
        return null;
    }
}
