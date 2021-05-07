package com.cibertec.veterinaria.service;

import java.util.List;

import com.cibertec.veterinaria.entity.Interfaz;

public interface InterfazService{

	public abstract List<Interfaz> listaInterfaz(int cod_tip_usu);
    
}