package com.priv.co.practice.domain.city.rules.impl;

import com.priv.co.practice.application.secondaryports.repository.CityRepository;
import com.priv.co.practice.domain.city.exception.CityDoesNotExistException;
import com.priv.co.practice.domain.city.rules.CityMustExistRule;


import java.util.UUID;

public class CityMustExistRuleImpl implements CityMustExistRule {

    private CityRepository cityRepository;

    public CityMustExistRuleImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public void execute(UUID data) {
        if(!cityRepository.existsById(data)){
            throw CityDoesNotExistException.create("la ciudad no existe");
        }
    }
}
