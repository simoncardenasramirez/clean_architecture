package com.priv.co.practice.domain;


import com.priv.co.practice.crosscutting.helpers.UUIDHelper;

import java.util.UUID;

public class Domain {

    private UUID id;

    protected Domain(final UUID id) {
        setId(id);
    }

    public final UUID getId() {
        return id;
    }

    private void setId(final UUID id) {
        this.id = id;
    }

    public void generateId() {
        this.id= UUIDHelper.generate();
    }

}

