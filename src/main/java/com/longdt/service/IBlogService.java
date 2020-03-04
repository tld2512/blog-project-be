package com.longdt.service;
import com.longdt.model.blog.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();

    Blog findById(long id);

    void save(Blog blog);

    List<Blog> findByTittle(String keyWord);

    void delete(long id);
}

