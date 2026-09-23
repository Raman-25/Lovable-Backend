package com.projects.lovable_clone.Dto.Member;

import com.projects.lovable_clone.enums.ProjectRole;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

public record MemberResponse(
        Long userId,
        String name,
        String email,
        ProjectRole projectRole,
        Instant invitedAt

) {
}
