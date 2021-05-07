package com.cibertec.veterinaria.repository;


import com.cibertec.veterinaria.entity.Interfaz;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface InterfazRepository extends JpaRepository<Interfaz,Integer> {
	
	@Query("select i from Interfaz i where i.tipoUsuario.cod_tip_usu = ?1")
	 public List<Interfaz> listaInterfaz(int cod_tip_usu);

}