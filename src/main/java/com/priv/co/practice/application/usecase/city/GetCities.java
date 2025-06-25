package com.priv.co.practice.application.usecase.city;

import com.priv.co.practice.application.usecase.UsecaseWithReturn;
import com.priv.co.practice.domain.city.CityDomain;

import java.util.List;

public interface GetCities extends UsecaseWithReturn<List<CityDomain>, Void> {
}
