package com.senai.backend.meu_app.services;

import com.senai.backend.meu_app.models.imoveisModels;
import com.senai.backend.meu_app.repositories.imoveisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class imoveisServices {

    @Autowired
    private imoveisRepository repository;

    public List<imoveisModels> findAll() {
        return repository.findAll();
    }

    public imoveisModels save(imoveisModels imovel) {
        return repository.save(imovel);
    }
}