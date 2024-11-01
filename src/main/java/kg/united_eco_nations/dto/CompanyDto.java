package kg.united_eco_nations.dto;

import lombok.Data;

import java.util.List;

@Data
public class CompanyDto {
    private Long id;

    private String name;

    private UserDto holder;

    private List<UserDto> participants;
}
