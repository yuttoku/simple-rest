package com.example.simplerest.domain.resository.dto.repositoryissue;

import com.example.simplerest.persistence.rest.github.response.listissuesforarepository.Creator;
import lombok.Data;

/**
 * @author Yudai Tokunaga
 */
@Data
class CreatorDTO {
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

    CreatorDTO(Creator creator) {
        this.login = creator.getLogin();
        this.id = creator.getId();
        this.nodeId = creator.getNode_id();
        this.avatarUrl = creator.getAvatar_url();
        this.gravatarId = creator.getGravatar_id();
        this.url = creator.getUrl();
        this.htmlUrl = creator.getHtml_url();
        this.followersUrl = creator.getFollowers_url();
        this.followingUrl = creator.getFollowing_url();
        this.gistsUrl = creator.getGists_url();
        this.starredUrl = creator.getStarred_url();
        this.subscriptionsUrl = creator.getSubscriptions_url();
        this.organizationsUrl = creator.getOrganizations_url();
        this.reposUrl = creator.getRepos_url();
        this.eventsUrl = creator.getEvents_url();
        this.receivedEventsUrl = creator.getReceived_events_url();
        this.type = creator.getType();
        this.siteAdmin = creator.getSite_admin();
    }
}
