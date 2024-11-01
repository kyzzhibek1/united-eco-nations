package kg.united_eco_nations.mapper;

import kg.united_eco_nations.dto.NewsDto;
import kg.united_eco_nations.entity.News;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface NewsMapper {
    NewsDto entityToDto(News news);

    News dtoToEntity(NewsDto newsDto);
}
