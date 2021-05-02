package com.cibertec.veterinaria.repository;

import com.cibertec.veterinaria.entity.Usuario;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
	
}