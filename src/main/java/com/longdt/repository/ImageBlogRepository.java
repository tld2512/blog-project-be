package com.longdt.repository;

import com.longdt.model.image.ImageBlog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageBlogRepository extends JpaRepository<ImageBlog, Long> {
}
