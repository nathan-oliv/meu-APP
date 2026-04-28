package com.senai.backend.meu_app.repositories;

import com.senai.backend.meu_app.models.corretoresModels;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface corretoresRepository extends JpaRepository<corretoresModels, Long> {
}