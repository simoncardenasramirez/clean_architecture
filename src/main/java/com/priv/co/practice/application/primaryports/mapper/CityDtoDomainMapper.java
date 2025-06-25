package com.priv.co.practice.application.primaryports.mapper;

import com.priv.co.practice.application.primaryports.dto.CityDto;
import com.priv.co.practice.domain.city.CityDomain;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CityDtoDomainMapper {
    CityDomain toDomain(CityDto dto);
    CityDto toDto(CityDomain domain);

    List<CityDomain> toDomainList(List<CityDto> dtoList);
    List<CityDto> toDtoList(List<CityDomain> domainList);
}

