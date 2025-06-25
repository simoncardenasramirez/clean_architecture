package com.priv.co.practice.application.secondaryports.mapper;

import com.priv.co.practice.application.secondaryports.entity.CityEntity;
import com.priv.co.practice.domain.city.CityDomain;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CityDomainEntityMapper {

    // Mapeo individual
    CityEntity toEntity(CityDomain domain);
    CityDomain toDomain(CityEntity entity);

    // Mapeo de listas
    List<CityEntity> toEntityList(List<CityDomain> domainList);
    List<CityDomain> toDomainList(List<CityEntity> entityList);
}
