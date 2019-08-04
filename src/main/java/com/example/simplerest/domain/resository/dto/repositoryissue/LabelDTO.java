package com.example.simplerest.domain.resository.dto.repositoryissue;

import com.example.simplerest.persistence.rest.github.response.listissuesforarepository.Label;
import lombok.Data;

/**
 * @author Yudai Tokunaga
 */
@Data
class LabelDTO {
    private Integer id;
    private String nodeId;
    private String url;
    private String name;
    private String description;
    private String color;
    // private Boolean default;

    LabelDTO(Label label) {
        this.id = label.getId();
        this.nodeId = label.getNode_id();
        this.url = label.getUrl();
        this.name = label.getName();
        this.description = label.getDescription();
        this.color = label.getColor();
        //  this.def = label.getDefault();
    }
}
