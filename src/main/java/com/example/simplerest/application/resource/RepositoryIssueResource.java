package com.example.simplerest.application.resource;

import com.example.simplerest.domain.resository.dto.repositoryissue.RepositoryIssueDTO;
import lombok.Data;

/**
 * @author Yudai Tokunaga
 */
@Data
public class RepositoryIssueResource {
    private String title;
    private String body;

    public RepositoryIssueResource(RepositoryIssueDTO issue) {
        String title = issue.getTitle();
        String body = issue.getBody();
        this.title = title.length() > 10 ? title.substring(0, 10) : title;
        this.body =  body.length() > 30 ? body.substring(0, 30) : body;
    }
}
