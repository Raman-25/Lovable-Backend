package com.projects.lovable_clone.service.impl;

import com.projects.lovable_clone.Dto.Member.InviteMemberRequest;
import com.projects.lovable_clone.Dto.Member.MemberResponse;
import com.projects.lovable_clone.Dto.Member.UpdateMemberRoleRequest;
import com.projects.lovable_clone.entity.ProjectEntity;
import com.projects.lovable_clone.entity.ProjectMemberEntity;
import com.projects.lovable_clone.entity.ProjectMemberId;
import com.projects.lovable_clone.entity.UserEntity;
import com.projects.lovable_clone.mapper.ProjectMemberMapper;
import com.projects.lovable_clone.repository.ProjectMemberRepository;
import com.projects.lovable_clone.repository.ProjectRepository;
import com.projects.lovable_clone.repository.UserRepository;
import com.projects.lovable_clone.service.ProjectMemberService;
import jakarta.transaction.Transactional;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ProjectMemberServiceImpl implements ProjectMemberService {

    ProjectMemberRepository projectMemberRepository;
    ProjectRepository projectRepository;
    ProjectMemberMapper projectMemberMapper;
    private final UserRepository userRepository;

    @Override
    public List<MemberResponse> getProjectMembers(Long projectId, Long userId) {
        ProjectEntity project = getAccessibleProjectById(projectId, userId);

        List<MemberResponse> memberResponsesList = new ArrayList<>();// First added the owner
        memberResponsesList.add(projectMemberMapper.toProjectMemberResponseFromOwner(project.getOwner()));

        memberResponsesList.addAll(
                projectMemberRepository.findByIdProjectId(projectId)
                        .stream()
                        .map(projectMemberMapper::toProjectMemberResponseFromProjectMember)
                        .toList());
        return memberResponsesList;
    }

    @Override
    public MemberResponse inviteByEmail(Long projectId, Long userId, InviteMemberRequest request){
        ProjectEntity project = getAccessibleProjectById(projectId, userId);

        if(!project.getOwner().getId().equals(userId)){
            throw new RuntimeException("Access Denied");  //only owner can invite
        }

        UserEntity invitee = userRepository.findByEmail(request.email()).orElseThrow();

        if(invitee.getId().equals(userId)){
            throw new RuntimeException("Cannot invite yourself");
        }

        ProjectMemberId projectMemberId = new ProjectMemberId(projectId,invitee.getId());
        if(projectMemberRepository.existsById(projectMemberId)){
            throw new RuntimeException("Cannot invite once again");
        }

        ProjectMemberEntity projectMember = ProjectMemberEntity.builder()
                .id(projectMemberId)
                .invitedAt(Instant.now())
                .projectRole(request.role())
                .user(invitee)
                .project(project)
                .build();

        projectMemberRepository.save(projectMember);

        return projectMemberMapper.toProjectMemberResponseFromProjectMember(projectMember);
    }

    @Override
    public MemberResponse updateMemberRole(Long projectId, Long userId, Long memberId, UpdateMemberRoleRequest request) {

        ProjectEntity project = getAccessibleProjectById(projectId, userId);
        if(!project.getOwner().getId().equals(userId)){
            throw new RuntimeException("Access Denied");  //only owner can invite
        }

        ProjectMemberId id = new ProjectMemberId(projectId, userId);
        ProjectMemberEntity projectMember = projectMemberRepository.findById(id).orElseThrow();

        projectMember.setProjectRole(request.projectRole());

        projectMemberRepository.save(projectMember);

        return projectMemberMapper.toProjectMemberResponseFromProjectMember(projectMember);

    }

    @Override
    public Void deleteProjectMember(Long projectId, Long userId, Long memberId) {
        return null;
    }

    // INTERNAL FUNCTIONS
    public ProjectEntity getAccessibleProjectById(Long projectId, Long userId) {
        return projectRepository.findAllAccessibleProjectById(projectId, userId).orElseThrow();
    }

}
