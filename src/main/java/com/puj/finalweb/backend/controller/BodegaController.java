package com.puj.finalweb.backend.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.puj.finalweb.backend.entity.Bodega;
import com.puj.finalweb.backend.service.BodegaService;

@RestController
@RequestMapping("/bodegas")
@CrossOrigin(origins = "http://localhost:4200")
public class BodegaController {

    private final BodegaService bodegaService;

    public BodegaController(BodegaService bodegaService) {
        this.bodegaService = bodegaService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Bodega registrar(@RequestBody Bodega bodega) {
        return bodegaService.registrar(bodega);
    }

    @GetMapping
    public List<Bodega> listar() {
        return bodegaService.listar();
    }
}
