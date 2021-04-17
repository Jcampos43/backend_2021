package com.cibertec.veterinaria.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.veterinaria.entity.TipoMascota;
import com.cibertec.veterinaria.repository.TipoMascotaRepository;
import com.cibertec.veterinaria.service.TipoMascotaService;

@Service
public class TipoMascotaServiceImpl implements TipoMascotaService{

	@Autowired
	TipoMascotaRepository tmRep;
	
	@Override
	public List<TipoMascota> listaTipoMascota() {
		return tmRep.findAll();
	}

}
