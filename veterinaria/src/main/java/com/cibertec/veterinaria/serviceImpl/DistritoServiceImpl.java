package com.cibertec.veterinaria.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.veterinaria.entity.Distrito;
import com.cibertec.veterinaria.repository.DistritoRepository;
import com.cibertec.veterinaria.service.DistritoService;

@Service
public class DistritoServiceImpl implements DistritoService{
	
	@Autowired
	DistritoRepository dRep;

	@Override
	public List<Distrito> listaDistrito() {
		return dRep.findAll();
	}
	
	

}
