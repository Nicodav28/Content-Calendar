package dev.nicodav28.content_calendar.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

public record Content(
        @Id Integer id,
        String title,
        @Column(value = "DESCRIPTION") String desc,
        Status status,
        Type contentType,
        LocalDateTime dateCreated,
        LocalDateTime dateUpdated,
        String url) {
}