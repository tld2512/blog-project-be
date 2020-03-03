package com.longdt.repository;

import com.longdt.model.image.ImageBlog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageBlogRepository extends JpaRepository<ImageBlog, Long> {
}
