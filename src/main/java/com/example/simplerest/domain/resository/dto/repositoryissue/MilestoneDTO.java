package com.example.simplerest.domain.resository.dto.repositoryissue;

import com.example.simplerest.persistence.rest.github.response.listissuesforarepository.Milestone;
import lombok.Data;
import java.util.Date;

/**
 * @author Yudai Tokunaga
 */
@Data
class MilestoneDTO {
    private String url;
    private String htmlUrl;
    private String labelsUrl;
    private Integer id;
    private String nodeId;
    private Integer number;
    private String state;
    private String title;
    private String description;
    private CreatorDTO creatorDTO;
    private Integer openIssues;
    private Integer closedIssues;
    private Date createdAt;
    private Date updatedAt;
    private Date closedAt;
    private Date dueOn;

    MilestoneDTO(Milestone milestone) {
        this.url = milestone.getUrl();
        this.htmlUrl = milestone.getHtml_url();
        this.labelsUrl = milestone.getLabels_url();
        this.id = milestone.getId();
        this.nodeId = milestone.getNode_id();
        this.number = milestone.getNumber();
        this.state = milestone.getState();
        this.title = milestone.getTitle();
        this.description = milestone.getDescription();
        this.creatorDTO = milestone.getCreator() == null ? null : new CreatorDTO(milestone.getCreator());
        this.openIssues = milestone.getOpen_issues();
        this.closedIssues = milestone.getClosed_issues();
        this.createdAt = milestone.getCreated_at();
        this.updatedAt = milestone.getUpdated_at();
        this.closedAt = milestone.getClosed_at();
        this.dueOn = milestone.getDue_on();
    }
}
