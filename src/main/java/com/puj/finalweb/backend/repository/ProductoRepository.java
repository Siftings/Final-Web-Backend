package com.puj.finalweb.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.puj.finalweb.backend.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
