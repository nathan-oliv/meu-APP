package com.senai.backend.meu_app.services;

import com.senai.backend.meu_app.models.clienteModels;
import com.senai.backend.meu_app.repositories.clienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
import java.util.List;

@Service
public class clienteServices {

    @Autowired
    private clienteRepository repository;

    public List<clienteModels> findAll() {
        return repository.findAll();
    }

    @Transactional
    public clienteModels save(clienteModels cliente) {
        return repository.save(cliente);
    }
}