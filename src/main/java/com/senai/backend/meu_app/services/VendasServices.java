package com.senai.backend.meu_app.services;

import com.senai.backend.meu_app.models.vendasModels;
import com.senai.backend.meu_app.repositories.vendasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VendasServices {

    @Autowired
    private vendasRepository repository;

    public List<vendasModels> findAll() {
        return repository.findAll();
    }

    public vendasModels save(vendasModels venda) {
        return repository.save(venda);
    }
}