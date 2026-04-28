package com.senai.backend.meu_app.repositories;

import com.senai.backend.meu_app.models.vendasModels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface vendasRepository extends JpaRepository<vendasModels, Long> {
}