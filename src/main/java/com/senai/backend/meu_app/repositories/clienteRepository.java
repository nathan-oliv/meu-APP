package com.senai.backend.meu_app.repositories;

import com.senai.backend.meu_app.models.clienteModels;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface clienteRepository extends JpaRepository<clienteModels, Long> {
}