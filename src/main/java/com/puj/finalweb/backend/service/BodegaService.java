package com.puj.finalweb.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.puj.finalweb.backend.entity.Bodega;
import com.puj.finalweb.backend.repository.BodegaRepository;

@Service
public class BodegaService {

    private final BodegaRepository bodegaRepository;

    public BodegaService(BodegaRepository bodegaRepository) {
        this.bodegaRepository = bodegaRepository;
    }

    public Bodega registrar(Bodega bodega) {
        return bodegaRepository.save(bodega);
    }

    public List<Bodega> listar() {
        return bodegaRepository.findAll();
    }
}
