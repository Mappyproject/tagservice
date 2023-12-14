package com.mappy.tagservice.service;

import com.mappy.tagservice.model.Tag;

import java.util.Optional;

public interface ITagService {
    Tag save(Tag tag);
    Iterable<Tag> getAll();
    Optional<Tag> getById(Long id);
    Tag update(Tag tag);
    void delete(Tag tag);
}
