package com.senai.backend.meu_app.services;

import com.senai.backend.meu_app.models.corretoresModels;
import com.senai.backend.meu_app.repositories.corretoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
import java.util.List;

@Service
public class corretoresServices {

    @Autowired
    private corretoresRepository repository;

    public List<corretoresModels> findAll() {
        return repository.findAll();
    }

    @Transactional
    public corretoresModels save(corretoresModels corretor) {
        return repository.save(corretor);
    }
}