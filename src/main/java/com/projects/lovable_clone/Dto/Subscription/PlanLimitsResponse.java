package com.projects.lovable_clone.Dto.Subscription;

public record PlanLimitsResponse(

        String planName,
        Integer maxTokenPerDay,
        Integer maxProjects,
        boolean unlimitedAi
) {
}
