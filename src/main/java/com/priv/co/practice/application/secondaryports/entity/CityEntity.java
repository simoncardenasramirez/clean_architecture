package com.priv.co.practice.application.secondaryports.entity;

import com.priv.co.practice.crosscutting.helpers.TextHelper;
import com.priv.co.practice.crosscutting.helpers.UUIDHelper;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "City")
public class CityEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, updatable = false)
    private UUID id;

    @Column(name = "name", nullable = false)
    private String name;

    public CityEntity() {
        this.id = UUIDHelper.getDefault();
        this.name = TextHelper.EMPTY;
    }

    private CityEntity(final UUID id, final String name) {
        this.id = UUIDHelper.getDefault(id, UUIDHelper.getDefault());
        this.name = TextHelper.applyTrim(name);
    }


    public static CityEntity create() {
        return new CityEntity();
    }

    public static CityEntity create(final UUID id, final String name) {
        return new CityEntity(id, name);
    }

    public static CityEntity create(final UUID id) {
        return new CityEntity(id, TextHelper.EMPTY);
    }


    public UUID getId() {
        return id;
    }

    public CityEntity setId(final UUID id) {
        this.id = UUIDHelper.getDefault(id, UUIDHelper.getDefault());
        return this;
    }

    public String getName() {
        return name;
    }

    public CityEntity setName(final String name) {
        this.name = TextHelper.applyTrim(name);
        return this;
    }
}
