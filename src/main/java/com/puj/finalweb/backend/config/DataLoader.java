package com.puj.finalweb.backend.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.puj.finalweb.backend.entity.Bodega;
import com.puj.finalweb.backend.entity.Producto;
import com.puj.finalweb.backend.repository.BodegaRepository;
import com.puj.finalweb.backend.repository.ProductoRepository;

@Component
public class DataLoader implements CommandLineRunner {

    private final BodegaRepository bodegaRepository;
    private final ProductoRepository productoRepository;

    public DataLoader(BodegaRepository bodegaRepository, ProductoRepository productoRepository) {
        this.bodegaRepository = bodegaRepository;
        this.productoRepository = productoRepository;
    }

    @Override
    public void run(String... args) {
        Bodega norte = bodegaRepository.save(new Bodega("Bodega Norte", "Calle 170 con algo"));
        Bodega sur = bodegaRepository.save(new Bodega("Bodega Sur", "Algun lugar en el sur"));

        productoRepository.save(new Producto("Computador portátil", "Portátil 15 pulgadas", 2500000.0, 15, norte));
        productoRepository.save(new Producto("Monitor", "Monitor 24 pulgadas", 750000.0, 20, norte));
        productoRepository.save(new Producto("Impresora", "Impresora láser", 1200000.0, 8, sur));
    }
}
