package com.longdt.repository;

import com.longdt.model.blog.Blog;
import com.longdt.model.tag.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BlogRepository extends JpaRepository<Blog, Long> {
    List<Blog> findAllByTittleContaining(String keyWord);

    List<Blog> findTop5ByOrderByViewDesc();

    List<Blog> findTop5ByTagListContainingOrderByViewDesc(Tag tag);
}
