package com.example.demo.domain.resository.dto.repositoryissue;

import com.example.demo.persistence.rest.github.response.listissuesforarepository.RepositoryIssue;
import lombok.Data;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Yudai Tokunaga
 */
@Data
public class RepositoryIssueDTO {
    private Integer id;
    private String nodeId;
    private String url;
    private String repositoryUrl;
    private String labelsUrl;
    private String commentsUrl;
    private String eventsUrl;
    private String htmlUrl;
    private Integer number;
    private String state;
    private String title;
    private String body;
    private UserDTO userDTO;
    private List<LabelDTO> labelDTOs;
    private AssigneeDTO assigneeDTO;
    private List<AssigneeDTO> assigneeDTOs;
    private MilestoneDTO milestoneDTO;
    private Boolean locked;
    private String activeLockReason;
    private Integer comments;
    private PullRequestDTO pullRequestDTO;
    private Date closedAt;
    private Date createdAt;
    private Date updatedAt;

    public RepositoryIssueDTO(RepositoryIssue repositoryIssue) {
        this.id = repositoryIssue.getId();
        this.nodeId = repositoryIssue.getNode_id();
        this.url = repositoryIssue.getUrl();
        this.repositoryUrl = repositoryIssue.getRepository_url();
        this.labelsUrl = repositoryIssue.getLabels_url();
        this.commentsUrl = repositoryIssue.getComments_url();
        this.eventsUrl = repositoryIssue.getEvents_url();
        this.htmlUrl = repositoryIssue.getHtml_url();
        this.number = repositoryIssue.getNumber();
        this.state = repositoryIssue.getState();
        this.title = repositoryIssue.getTitle();
        this.body = repositoryIssue.getBody();
        this.userDTO = repositoryIssue.getUser() == null ? null : new UserDTO(repositoryIssue.getUser());
        this.labelDTOs = repositoryIssue.getLabels() == null ? null : repositoryIssue.getLabels().stream().map(LabelDTO::new).collect(Collectors.toList());
        this.assigneeDTO = repositoryIssue.getAssignee() == null ? null : new AssigneeDTO(repositoryIssue.getAssignee());
        this.assigneeDTOs = repositoryIssue.getAssignees() == null ? null : repositoryIssue.getAssignees().stream().map(AssigneeDTO::new).collect(Collectors.toList());
        this.milestoneDTO = repositoryIssue.getMilestone() == null ? null : new MilestoneDTO(repositoryIssue.getMilestone());
        this.locked = repositoryIssue.getLocked();
        this.activeLockReason = repositoryIssue.getActive_lock_reason();
        this.comments = repositoryIssue.getComments();
        this.pullRequestDTO = repositoryIssue.getPull_request() == null ? null : new PullRequestDTO(repositoryIssue.getPull_request());
        this.closedAt = repositoryIssue.getClosed_at();
        this.createdAt = repositoryIssue.getCreated_at();
        this.updatedAt = repositoryIssue.getUpdated_at();
    }
}
