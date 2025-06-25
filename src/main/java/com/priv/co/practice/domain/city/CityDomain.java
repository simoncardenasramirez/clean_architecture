package com.priv.co.practice.domain.city;


import com.priv.co.practice.domain.Domain;

import java.util.UUID;

public class CityDomain extends Domain {

    private String name;

    public CityDomain(UUID id, String name) {
        super(id);
        setName(name);
    }

    public static final CityDomain create(UUID id, String name ) {
        return new CityDomain(id, name);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

}
