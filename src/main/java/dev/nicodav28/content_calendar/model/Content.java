package dev.nicodav28.content_calendar.model;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

public record Content(
                Integer id,

                @NotBlank String title,
                String desc,
                Status status,
                Type contentType,
                LocalDateTime dateCreated,
                LocalDateTime dateeUpdated,
                String url) {

}
