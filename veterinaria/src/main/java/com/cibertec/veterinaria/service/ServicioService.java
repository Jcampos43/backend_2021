package com.cibertec.veterinaria.service;

import java.util.List;

import com.cibertec.veterinaria.entity.Servicio;

public interface ServicioService {
	public abstract List<Servicio> listaServicio();
	public abstract Servicio insertaServicio(Servicio obj);
	public abstract String eliminaServicio(int cod_ser);
	public abstract String actualizaServicio(Servicio servicio);
}
