package com.senai.backend.meu_app.controllers;

import com.senai.backend.meu_app.models.corretoresModels;
import com.senai.backend.meu_app.services.corretoresServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/corretores")
public class corretoresController {

    @Autowired
    private corretoresServices service;

    @GetMapping
    public ResponseEntity<List<corretoresModels>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
    }

    @PostMapping
    public ResponseEntity<corretoresModels> create(@RequestBody corretoresModels corretor) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(corretor));
    }
}