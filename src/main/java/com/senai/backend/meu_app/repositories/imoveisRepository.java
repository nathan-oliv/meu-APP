package com.senai.backend.meu_app.repositories;

import com.senai.backend.meu_app.models.imoveisModels;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface imoveisRepository extends JpaRepository<imoveisModels, Long> {
}