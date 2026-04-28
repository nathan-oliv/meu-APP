package com.senai.backend.meu_app.controllers;

import com.senai.backend.meu_app.models.vendasModels;
import com.senai.backend.meu_app.services.VendasServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/vendas")
public class vendasController {

    @Autowired
    private VendasServices service;

    @GetMapping
    public ResponseEntity<List<vendasModels>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
    }

    @PostMapping
    public ResponseEntity<vendasModels> create(@RequestBody vendasModels venda) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(venda));
    }
}