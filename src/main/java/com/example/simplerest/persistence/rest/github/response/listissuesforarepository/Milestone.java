package com.example.simplerest.persistence.rest.github.response.listissuesforarepository;

import lombok.Data;
import java.util.Date;

/**
 * @author Yudai Tokunaga
 */
@Data
public class Milestone {
    private String url;
    private String html_url;
    private String labels_url;
    private Integer id;
    private String node_id;
    private Integer number;
    private String state;
    private String title;
    private String description;
    private Creator creator;
    private Integer open_issues;
    private Integer closed_issues;
    private Date created_at;
    private Date updated_at;
    private Date closed_at;
    private Date due_on;
}
