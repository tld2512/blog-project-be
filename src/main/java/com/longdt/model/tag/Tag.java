package com.longdt.model.tag;

import com.longdt.model.blog.Blog;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "tag")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    @ManyToMany(targetEntity = Blog.class, fetch = FetchType.EAGER)
    private List<Blog> blogList;

    public Tag() {
    }
}
