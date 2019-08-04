package com.example.simplerest.persistence.rest.github;

import com.example.simplerest.persistence.rest.github.response.listissuesforarepository.RepositoryIssue;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import java.util.List;

/**
 * @author Yudai Tokunaga
 */
@Component
public class IssuesRestClientImpl implements IssuesRestClient {
    public List<RepositoryIssue> requestListIssuesForaRepository(String url) {
        return new RestTemplate()
                .exchange(url, HttpMethod.GET,null, new ParameterizedTypeReference<List<RepositoryIssue>>(){})
                .getBody();
    }
}
