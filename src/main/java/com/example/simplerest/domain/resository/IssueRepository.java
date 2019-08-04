package com.example.simplerest.domain.resository;

import com.example.simplerest.domain.resository.dto.repositoryissue.RepositoryIssueDTO;
import java.util.List;
import java.util.Map;

/**
 * @author Yudai Tokunaga
 */
public interface IssueRepository {
    /**
     * search repository issues
     * @param owner Repository owner
     * @param repo Repository name
     * @param params request parameters
     * @return Repository Issues
     */
    List<RepositoryIssueDTO> search(String owner, String repo, Map<String, String> params);
}
