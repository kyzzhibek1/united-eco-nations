package kg.united_eco_nations.dto;

import lombok.Data;

import java.time.Instant;

@Data
public class NewsDto {
    private Long id;

    private String name;

    private String description;

    private Instant publishedDate;

    private boolean isEdited;

    private UserDto author;
}
