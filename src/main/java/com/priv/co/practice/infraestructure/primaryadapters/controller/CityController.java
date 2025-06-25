package com.priv.co.practice.infraestructure.primaryadapters.controller;

import com.priv.co.practice.application.primaryports.dto.CityDto;
import com.priv.co.practice.application.primaryports.interactor.city.GetCitiesInteractor;
import com.priv.co.practice.application.primaryports.interactor.city.RegisterNewCityInteractor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cities")
public class CityController {

    private final RegisterNewCityInteractor registerNewCityInteractor;
    private final GetCitiesInteractor getCitiesInteractor;

    public CityController(RegisterNewCityInteractor registerNewCityInteractor,
                          GetCitiesInteractor getCitiesInteractor) {
        this.registerNewCityInteractor = registerNewCityInteractor;
        this.getCitiesInteractor = getCitiesInteractor;
    }

    @PostMapping
    public ResponseEntity<String> createCity(@RequestBody CityDto cityDto) {
        try {
            registerNewCityInteractor.execute(cityDto);
            return ResponseEntity.status(HttpStatus.CREATED).body("Ciudad registrada exitosamente");
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error de validación: " + e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error interno al registrar la ciudad");
        }
    }

    @GetMapping
    public ResponseEntity<List<CityDto>> getAllCities() {
        try {
            List<CityDto> cities = getCitiesInteractor.execute(null);
            return ResponseEntity.ok(cities);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}