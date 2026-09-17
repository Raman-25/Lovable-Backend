package com.projects.lovable_clone.service;

import com.projects.lovable_clone.Dto.project.FileContentResponse;
import com.projects.lovable_clone.Dto.project.FileNode;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileService {
    public @Nullable List<FileNode> getFileTree(Long projectId, Long userId) {
    }

    public @Nullable FileContentResponse getFile(Long projectId, String path, Long userId) {
    }
}
