package com.longdt.model.blog;

import lombok.Data;

import java.io.Serializable;

@Data
public class BlogForm implements Serializable {
    private long id;
    private String tittle;
    private String description;
    private String image;
    private Iterable<Long> tagList;
    private String content;
    public BlogForm() {
    }
}
