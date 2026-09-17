package com.projects.lovable_clone.service;


import com.projects.lovable_clone.Dto.Member.InviteMemberRequest;
import com.projects.lovable_clone.Dto.Member.MemberResponse;
import com.projects.lovable_clone.Dto.Member.UpdateMemberRequest;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectMemberService {
    public  List<MemberResponse> getProjectMembers(Long projectId, Long userId) {
    }

    public  MemberResponse inviteByEmail(Long projectId, Long userId, InviteMemberRequest request) {
    }

    public  MemberResponse updateMemberRole(Long projectId, Long userId, Long memberId, UpdateMemberRequest request) {
    }

    public  Void deleteProjectMember(Long projectId, Long userId, Long memberId) {
    }
}
