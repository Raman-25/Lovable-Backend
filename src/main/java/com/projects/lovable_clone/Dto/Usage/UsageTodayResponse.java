package com.projects.lovable_clone.Dto.Usage;

public record UsageTodayResponse(
        int tokenUsed,
        int projectRunning,
        int tokenLimit,
        int previewLimit

) {
}
