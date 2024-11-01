package kg.united_eco_nations.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.Instant;

@Data
@Entity
@Table(name = "news")
@Accessors(chain = true)
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    private String description;

    private Instant publishedDate;

    private boolean isEdited;

    @ManyToOne
    private User author;

}
