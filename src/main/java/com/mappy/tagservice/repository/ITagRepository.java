package com.mappy.tagservice.repository;

import com.mappy.tagservice.model.Tag;
import org.springframework.data.repository.CrudRepository;

public interface ITagRepository extends CrudRepository<Tag, Long> {
}
