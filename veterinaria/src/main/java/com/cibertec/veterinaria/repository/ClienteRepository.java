package com.cibertec.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.veterinaria.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
