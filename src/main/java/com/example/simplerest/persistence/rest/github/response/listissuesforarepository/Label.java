package com.example.demo.persistence.rest.github.response.listissuesforarepository;

import lombok.Data;

/**
 * @author Yudai Tokunaga
 */
@Data
public class Label {
    private Integer	id;
    private String node_id;
    private String url;
    private String name;
    private String description;
    private String color;
    // private Boolean default;
}
