package com.priv.co.practice.application.primaryports.interactor.city.impl;

import com.priv.co.practice.application.primaryports.dto.CityDto;
import com.priv.co.practice.application.primaryports.interactor.city.GetCitiesInteractor;
import com.priv.co.practice.application.primaryports.mapper.CityDtoDomainMapper;
import com.priv.co.practice.application.usecase.city.GetCities;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class GetCitiesInteractorImpl implements GetCitiesInteractor {

    private final GetCities getCitiesUseCase;
    private final CityDtoDomainMapper cityDtoDomainMapper;

    public GetCitiesInteractorImpl(GetCities getCitiesUseCase, CityDtoDomainMapper cityDtoDomainMapper) {
        this.getCitiesUseCase = getCitiesUseCase;
        this.cityDtoDomainMapper = cityDtoDomainMapper;
    }

    @Override
    public List<CityDto> execute(Void data) {
        var cityDomains = getCitiesUseCase.execute(data);
        return cityDtoDomainMapper.toDtoList(cityDomains);
    }
}
