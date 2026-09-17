package com.projects.lovable_clone.Dto.Subscription;

public record PlanResponse(

        Long id,
        String name,
        String stripePriceId,
        Integer maxProjects,
        Integer maxTokensPerDay,
        Integer maxPreviews,
        Boolean unlimitedAi,
        String price


) {
}
