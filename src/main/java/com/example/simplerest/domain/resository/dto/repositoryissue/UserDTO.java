package com.example.demo.domain.resository.dto.repositoryissue;

import com.example.demo.persistence.rest.github.response.listissuesforarepository.User;
import lombok.Data;

/**
 * @author Yudai Tokunaga
 */
@Data
class UserDTO {
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

    UserDTO(User user) {
        this.login = user.getLogin();
        this.id = user.getId();
        this.nodeId = user.getNode_id();
        this.avatarUrl = user.getAvatar_url();
        this.gravatarId = user.getGravatar_id();
        this.url = user.getUrl();
        this.htmlUrl = user.getHtml_url();
        this.followersUrl = user.getFollowers_url();
        this.followingUrl = user.getFollowing_url();
        this.gistsUrl = user.getGists_url();
        this.starredUrl = user.getStarred_url();
        this.subscriptionsUrl = user.getSubscriptions_url();
        this.organizationsUrl = user.getOrganizations_url();
        this.reposUrl = user.getRepos_url();
        this.eventsUrl = user.getEvents_url();
        this.receivedEventsUrl = user.getReceived_events_url();
        this.type = user.getType();
        this.siteAdmin = user.getSite_admin();
    }
}
