package com.priv.co.practice.application.secondaryports.repository;

import com.priv.co.practice.application.secondaryports.entity.CityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CityRepository extends JpaRepository<CityEntity, UUID> {
}
