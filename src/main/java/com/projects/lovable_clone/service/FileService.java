package com.projects.lovable_clone.service;

import com.projects.lovable_clone.Dto.project.FileContentResponse;
import com.projects.lovable_clone.Dto.project.FileNode;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface FileService {

    @Nullable List<FileNode> getFileTree(Long projectId, Long userId);

    @Nullable FileContentResponse getFile(Long projectId, String path, Long userId);
}
