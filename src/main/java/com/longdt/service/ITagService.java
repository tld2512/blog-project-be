package com.longdt.service;

import com.longdt.model.tag.Tag;

import java.util.List;

public interface ITagService {
    List<Tag> findAll();
    List<Tag> findAllById(Iterable<Long> id);
    void addTag(Tag tag);
    Tag findById(long id);
}
