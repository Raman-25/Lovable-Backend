package com.projects.lovable_clone.service;

import com.projects.lovable_clone.Dto.Member.InviteMemberRequest;
import com.projects.lovable_clone.Dto.Member.MemberResponse;
import com.projects.lovable_clone.Dto.Member.UpdateMemberRoleRequest;

import java.util.List;

public interface ProjectMemberService {

    List<MemberResponse> getProjectMembers(Long projectId, Long userId);

    MemberResponse inviteByEmail(Long projectId, Long userId, InviteMemberRequest request);

    MemberResponse updateMemberRole(Long projectId, Long userId, Long memberId, UpdateMemberRoleRequest request);

    Void deleteProjectMember(Long projectId, Long userId, Long memberId);
}
