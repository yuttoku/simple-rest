package com.example.simplerest.domain.service;

import com.example.simplerest.domain.resository.IssueRepository;
import com.example.simplerest.domain.resository.dto.repositoryissue.RepositoryIssueDTO;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

/**
 * @author Yudai Tokunaga
 */
@Service
public class RepositoryIssuesServiceImpl implements RepositoryIssueService {

    private final IssueRepository issueRepository;

    RepositoryIssuesServiceImpl(IssueRepository issueRepository) {
        this.issueRepository = issueRepository;
    }

    @Override
    public List<RepositoryIssueDTO> search(String owner, String repo, Map<String, String> params) {
        return issueRepository.search(owner, repo, params);
    }
}
