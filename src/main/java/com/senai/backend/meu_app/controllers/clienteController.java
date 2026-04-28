package com.senai.backend.meu_app.controllers;

import com.senai.backend.meu_app.models.clienteModels;
import com.senai.backend.meu_app.services.clienteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes") // Rota para acessar no navegador/Insomnia
public class clienteController {

    @Autowired
    private clienteServices service;

    @GetMapping
    public ResponseEntity<List<clienteModels>> getAllClientes() {
        return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
    }

    @PostMapping
    public ResponseEntity<clienteModels> saveCliente(@RequestBody clienteModels cliente) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(cliente));
    }
}