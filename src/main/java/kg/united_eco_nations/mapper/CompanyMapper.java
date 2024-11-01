package kg.united_eco_nations.mapper;

import kg.united_eco_nations.dto.CompanyDto;
import kg.united_eco_nations.entity.Company;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CompanyMapper {
    CompanyDto entityToDto(Company company);

    Company dtoToEntity(CompanyDto companyDto);
}
