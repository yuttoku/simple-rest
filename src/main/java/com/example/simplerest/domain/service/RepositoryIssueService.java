package com.example.simplerest.domain.service;

import com.example.simplerest.domain.resository.dto.repositoryissue.RepositoryIssueDTO;
import java.util.List;
import java.util.Map;

/**
 * @author Yudai Tokunaga
 */
public interface RepositoryIssueService {
    /**
     * search repository issues by page
     * @param owner Repository owner
     * @param repo Repository name
     * @param params request parameters
     * @return Repository Issues
     */
    List<RepositoryIssueDTO> search(String owner, String repo, Map<String, String> params);
}
