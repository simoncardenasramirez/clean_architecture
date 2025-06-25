package com.priv.co.practice.application.primaryports.interactor.city;

import com.priv.co.practice.application.primaryports.dto.CityDto;
import com.priv.co.practice.application.primaryports.interactor.InteractorWithReturn;

import java.util.List;

public interface GetCitiesInteractor extends InteractorWithReturn<Void, List<CityDto>> {
}
