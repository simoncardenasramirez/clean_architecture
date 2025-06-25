package com.priv.co.practice.application.primaryports.dto;

import java.util.UUID;
import com.priv.co.practice.crosscutting.helpers.TextHelper;
import com.priv.co.practice.crosscutting.helpers.UUIDHelper;



public class CityDto {
    private UUID id;
    private String name;

    public CityDto() {
        setId(UUIDHelper.getDefault());
        setName(TextHelper.EMPTY);
    }

    public CityDto(final UUID id, final String name) {
        setId(id);
        setName(name);
    }

    public static final CityDto create() {
        return new CityDto();
    }

    public static final CityDto create(final UUID id, final String name) {
        return new CityDto(id, name);
    }

    public static final CityDto create(final UUID id) {
        return new CityDto(id, TextHelper.EMPTY);
    }

    public UUID getId() {
        return id;
    }

    public CityDto setId(final UUID id) {
        this.id = UUIDHelper.getDefault(id,UUIDHelper.getDefault());
        return this;
    }

    public String getName() {
        return name;
    }

    public CityDto setName(final String name) {
        this.name = TextHelper.applyTrim(name);
        return this;
    }

}
