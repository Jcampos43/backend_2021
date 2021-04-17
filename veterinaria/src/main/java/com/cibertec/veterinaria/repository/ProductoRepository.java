package com.cibertec.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.veterinaria.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
