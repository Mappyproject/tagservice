package com.mappy.tagservice.service;

import com.mappy.tagservice.model.Tag;
import com.mappy.tagservice.repository.ITagRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TagService implements ITagService {
    private final ITagRepository tagRepository;
    @Override
    public Tag save(Tag tag) {
        return tagRepository.save(tag);
    }

    @Override
    public Iterable<Tag> getAll() {
        return tagRepository.findAll();
    }

    @Override
    public Optional<Tag> getById(Long id) {
        return tagRepository.findById(id);
    }

    @Override
    public Tag update(Tag tag) {
        return tagRepository.save(tag);
    }

    @Override
    public void delete(Tag tag) {
        tagRepository.delete(tag);
    }
}
