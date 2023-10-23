package example.gof.behavioral_pattern.iterator;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Post {

    private String title;

    private LocalDateTime createdDateTime;

    public Post(String title) {
        this.title = title;
        this.createdDateTime = LocalDateTime.now();
    }
}
