package com.cibertec.veterinaria.service;

import java.util.List;

import com.cibertec.veterinaria.entity.Mascota;

public interface MascotaService {

	public abstract List<Mascota> listaMascota();
	public abstract Mascota insertaMascota(Mascota obj);
	public abstract String eliminaMascota(int cod_mas);
	public abstract String actualizaMascota(Mascota MascotaNew);
	
}
