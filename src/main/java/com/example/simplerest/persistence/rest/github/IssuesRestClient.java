package com.example.demo.persistence.rest.github;

import com.example.demo.persistence.rest.github.response.listissuesforarepository.RepositoryIssue;

import java.util.List;

/**
 * @author Yudai Tokunaga
 */
public interface IssuesRestClient {
    /**
     * call GitHub API for "List issues for a repository"
     * @param url Request URL
     * @return response of "List issues for a repository"
     */
    List<RepositoryIssue> requestListIssuesForaRepository(String url);
}
