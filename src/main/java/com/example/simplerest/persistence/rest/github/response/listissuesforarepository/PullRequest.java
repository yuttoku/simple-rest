package com.example.demo.persistence.rest.github.response.listissuesforarepository;

import lombok.Data;

/**
 * @author Yudai Tokunaga
 */
@Data
public class PullRequest {
    private String url;
    private String html_url;
    private String diff_url;
    private String patch_url;
}
