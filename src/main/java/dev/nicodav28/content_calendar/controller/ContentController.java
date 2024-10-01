package dev.nicodav28.content_calendar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.nicodav28.content_calendar.repository.ContentCollectionRepository;

@RestController
@RequestMapping("/api/content")
public class ContentController {

    private final ContentCollectionRepository contentRepository;

    public ContentController(ContentCollectionRepository contentRepository) {
        this.contentRepository = contentRepository;
    }
}
