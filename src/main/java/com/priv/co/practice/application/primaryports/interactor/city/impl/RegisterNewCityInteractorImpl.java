package com.priv.co.practice.application.primaryports.interactor.city.impl;

import com.priv.co.practice.application.primaryports.dto.CityDto;
import com.priv.co.practice.application.primaryports.interactor.city.RegisterNewCityInteractor;
import com.priv.co.practice.application.primaryports.mapper.CityDtoDomainMapper;
import com.priv.co.practice.application.usecase.city.RegisterNewCity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RegisterNewCityInteractorImpl implements RegisterNewCityInteractor {

    private final RegisterNewCity registerNewCityUseCase;
    private final CityDtoDomainMapper cityDtoDomainMapper;

    @Autowired
    public RegisterNewCityInteractorImpl(RegisterNewCity registerNewCityUseCase,
                                         CityDtoDomainMapper cityDtoDomainMapper) {
        this.registerNewCityUseCase = registerNewCityUseCase;
        this.cityDtoDomainMapper = cityDtoDomainMapper;
    }

    @Override
    public void execute(CityDto data) {
        var domain = cityDtoDomainMapper.toDomain(data);
        registerNewCityUseCase.execute(domain);
    }
}
