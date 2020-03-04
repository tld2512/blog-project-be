package com.longdt.service.impl;

import com.longdt.model.tag.Tag;
import com.longdt.repository.TagRepository;
import com.longdt.service.ITagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagService implements ITagService {
    @Autowired
    private TagRepository tagRepository;

    @Override
    public List<Tag> findAll() {
        return tagRepository.findAll();
    }

    @Override
    public List<Tag> findAllById(Iterable<Long> id) {
        return tagRepository.findAllById(id);
    }

    @Override
    public void addTag(Tag tag) {
        tagRepository.save(tag);
    }

    @Override
    public Tag findById(long id) {
        return tagRepository.findById(id).get();
    }
}
