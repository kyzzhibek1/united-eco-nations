package kg.united_eco_nations.mapper;

import kg.united_eco_nations.dto.UserDto;
import kg.united_eco_nations.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto entityToDto(User user);

    User dtoToEntity(UserDto userDto);
}
