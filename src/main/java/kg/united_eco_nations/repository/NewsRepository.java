package kg.united_eco_nations.repository;

import kg.united_eco_nations.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, Long> {

}
