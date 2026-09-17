package com.projects.lovable_clone.Dto.Member;

import com.projects.lovable_clone.enums.ProjectRole;

public record InviteMemberRequest(
        String email,
        ProjectRole role
) {
}
