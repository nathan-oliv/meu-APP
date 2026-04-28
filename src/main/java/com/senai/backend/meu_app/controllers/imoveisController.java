package com.senai.backend.meu_app.controllers;

import com.senai.backend.meu_app.models.imoveisModels;
import com.senai.backend.meu_app.services.imoveisServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/imoveis") // Rota para gerenciar o inventário de imóveis
public class imoveisController {

    @Autowired
    private imoveisServices service;

    // Listar todos os imóveis
    @GetMapping
    public ResponseEntity<List<imoveisModels>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
    }

    // Cadastrar um novo imóvel
    @PostMapping
    public ResponseEntity<imoveisModels> create(@RequestBody imoveisModels imovel) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(imovel));
    }
}