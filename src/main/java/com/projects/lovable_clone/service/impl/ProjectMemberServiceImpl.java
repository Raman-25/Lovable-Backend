package com.projects.lovable_clone.service.impl;

import com.projects.lovable_clone.Dto.Member.InviteMemberRequest;
import com.projects.lovable_clone.Dto.Member.MemberResponse;
import com.projects.lovable_clone.Dto.Member.UpdateMemberRoleRequest;
import com.projects.lovable_clone.service.ProjectMemberService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectMemberServiceImpl implements ProjectMemberService {

    @Override
    public List<MemberResponse> getProjectMembers(Long projectId, Long userId) {
        return null;
    }

    @Override
    public MemberResponse inviteByEmail(Long projectId, Long userId, InviteMemberRequest request) {
        return null;
    }

    @Override
    public MemberResponse updateMemberRole(Long projectId, Long userId, Long memberId, UpdateMemberRoleRequest request) {
        return null;
    }

    @Override
    public Void deleteProjectMember(Long projectId, Long userId, Long memberId) {
        return null;
    }
}
