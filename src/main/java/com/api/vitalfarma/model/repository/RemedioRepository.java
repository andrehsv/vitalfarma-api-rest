package com.api.vitalfarma.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.vitalfarma.model.entity.Remedio;

public interface RemedioRepository extends JpaRepository<Remedio, Long> {}