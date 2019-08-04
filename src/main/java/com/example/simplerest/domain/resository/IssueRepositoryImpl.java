package com.example.simplerest.domain.resository;

import com.example.simplerest.domain.resository.dto.repositoryissue.RepositoryIssueDTO;
import com.example.simplerest.persistence.rest.github.IssuesRestClient;
import com.example.simplerest.persistence.rest.github.response.listissuesforarepository.RepositoryIssue;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import static com.example.demo.persistence.rest.Utility.createUrl;
import static com.example.simplerest.persistence.rest.github.Constant.DOMAIN;

/**
 * @author Yudai Tokunaga
 */
@Repository
public class IssueRepositoryImpl implements IssueRepository {

    private IssuesRestClient issuesRestClient;

    IssueRepositoryImpl(IssuesRestClient issuesRestClient) {
        this.issuesRestClient = issuesRestClient;
    }

    @Override
    public List<RepositoryIssueDTO> search(String owner, String repo, Map<String, String> params) {
        String url = createUrl(params, DOMAIN, "/repos/", owner, "/", repo, "/issues");
        List<RepositoryIssue> repositoryIssues = issuesRestClient.requestListIssuesForaRepository(url);
        return repositoryIssues.stream().map(RepositoryIssueDTO::new).collect(Collectors.toList());
    }
}
