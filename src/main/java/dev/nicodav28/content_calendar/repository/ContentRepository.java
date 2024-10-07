package dev.nicodav28.content_calendar.repository;

import org.springframework.data.repository.ListCrudRepository;

import dev.nicodav28.content_calendar.model.Content;

import java.util.List;

public interface ContentRepository extends ListCrudRepository<Content, Integer> {

    List<Content> findAllByContentType(String type);
}