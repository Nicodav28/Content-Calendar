package dev.nicodav28.content_calendar.repository;

import org.springframework.stereotype.Repository;
import dev.nicodav28.content_calendar.model.Content;
import dev.nicodav28.content_calendar.model.Status;
import dev.nicodav28.content_calendar.model.Type;
import jakarta.annotation.PostConstruct;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentCollectionRepository {

    private final List<Content> contentList = new ArrayList<>();

    public ContentCollectionRepository() {
    }

    @PostConstruct
    private void init() {
        Content content = new Content(1, "My firtst blog post", "My first blog post", Status.IDEA, Type.ARTICLE,
                LocalDateTime.now(), null, "");

        contentList.add(content);
    }

    public List<Content> findAll() {
        return contentList;
    }

    public Optional<Content> findById(Integer id) {
        return contentList.stream().filter(c -> c.id().equals(id)).findFirst();
    }

    public void save(Content content) {
        contentList.add(content);
    }
}
