package com.projects.lovable_clone.Dto.Usage;

public record PlanLimitResponse(
       String planName,
       int maxTokenPerDay,
       int maxProjects,
       boolean unlimitedAi
) {
}
