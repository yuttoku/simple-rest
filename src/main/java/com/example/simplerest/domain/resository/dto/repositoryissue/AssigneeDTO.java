package com.example.simplerest.domain.resository.dto.repositoryissue;

import com.example.simplerest.persistence.rest.github.response.listissuesforarepository.Assignee;
import lombok.Data;

/**
 * @author Yudai Tokunaga
 */
@Data
class AssigneeDTO {
    private String login;
    private Integer id;
    private String nodeId;
    private String avatarUrl;
    private String gravatarId;
    private String url;
    private String htmlUrl;
    private String followersUrl;
    private String followingUrl;
    private String gistsUrl;
    private String starredUrl;
    private String subscriptionsUrl;
    private String organizationsUrl;
    private String reposUrl;
    private String eventsUrl;
    private String receivedEventsUrl;
    private String type;
    private Boolean siteAdmin;

    AssigneeDTO(Assignee assignee) {
        this.login = assignee.getLogin();
        this.id = assignee.getId();
        this.nodeId = assignee.getNode_id();
        this.avatarUrl = assignee.getAvatar_url();
        this.gravatarId = assignee.getGravatar_id();
        this.url = assignee.getUrl();
        this.htmlUrl = assignee.getHtml_url();
        this.followersUrl = assignee.getFollowers_url();
        this.followingUrl = assignee.getFollowing_url();
        this.gistsUrl = assignee.getGists_url();
        this.starredUrl = assignee.getStarred_url();
        this.subscriptionsUrl = assignee.getSubscriptions_url();
        this.organizationsUrl = assignee.getOrganizations_url();
        this.reposUrl = assignee.getRepos_url();
        this.eventsUrl = assignee.getEvents_url();
        this.receivedEventsUrl = assignee.getReceived_events_url();
        this.type = assignee.getType();
        this.siteAdmin = assignee.getSite_admin();
    }
}
