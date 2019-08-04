package com.example.demo.persistence.rest.github.response.listissuesforarepository;

import lombok.Data;
import java.util.Date;
import java.util.List;

/**
 * @author Yudai Tokunaga
 */
@Data
public class RepositoryIssue {
    private Integer id;
    private String node_id;
    private String url;
    private String repository_url;
    private String labels_url;
    private String comments_url;
    private String events_url;
    private String html_url;
    private Integer number;
    private String state;
    private String title;
    private String body;
    private User user;
    private List<Label> labels;
    private Assignee assignee;
    private List<Assignee> assignees;
    private Milestone milestone;
    private Boolean locked;
    private String active_lock_reason;
    private Integer comments;
    private PullRequest pull_request;
    private Date closed_at;
    private Date created_at;
    private Date updated_at;
}
