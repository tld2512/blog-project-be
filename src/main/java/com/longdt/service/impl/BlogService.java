package com.longdt.service.impl;

import com.longdt.model.blog.Blog;
import com.longdt.repository.BlogRepository;
import com.longdt.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private BlogRepository blogRepository;

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Blog findById(long id) {
        return blogRepository.findById(id).get();
    }

    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public List<Blog> findByTittle(String keyWord) {
        return blogRepository.findAllByTittleContaining(keyWord);
    }

    @Override
    public void delete(long id) {
        blogRepository.deleteById(id);
    }
}
