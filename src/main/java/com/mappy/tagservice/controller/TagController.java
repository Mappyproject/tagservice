package com.mappy.tagservice.controller;

import com.mappy.tagservice.model.Tag;
import com.mappy.tagservice.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/")
public class TagController {
    private TagService tagService;
    @Autowired
    public TagController(TagService tagService) { this.tagService = tagService; }

    @GetMapping
    public Iterable<Tag> getAll() { return tagService.getAll(); }
    @GetMapping("/{id}")
    public Optional<Tag> getById(Long tagId) { return tagService.getById(tagId); }
    @PostMapping
    public Tag save(Tag tag) { return tagService.save(tag); }
    @PutMapping
    public Tag update(Tag tag) { return tagService.update(tag); }
    @DeleteMapping
    public void delete(Tag tag) { tagService.delete(tag); }
}
