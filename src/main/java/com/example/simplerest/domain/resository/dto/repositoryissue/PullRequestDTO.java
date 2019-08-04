package com.example.simplerest.domain.resository.dto.repositoryissue;

import com.example.simplerest.persistence.rest.github.response.listissuesforarepository.PullRequest;
import lombok.Data;

/**
 * @author Yudai Tokunaga
 */
@Data
class PullRequestDTO {
    private String url;
    private String htmlUrl;
    private String diffUrl;
    private String patchUrl;

    PullRequestDTO(PullRequest pullRequest) {
        this.url = pullRequest.getUrl();
        this.htmlUrl = pullRequest.getHtml_url();
        this.diffUrl = pullRequest.getDiff_url();
        this.patchUrl= pullRequest.getPatch_url();
    }
}
