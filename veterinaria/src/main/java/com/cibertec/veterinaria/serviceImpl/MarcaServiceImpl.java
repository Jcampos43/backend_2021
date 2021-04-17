package com.cibertec.veterinaria.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.veterinaria.entity.Marca;
import com.cibertec.veterinaria.repository.MarcaRepository;
import com.cibertec.veterinaria.service.MarcaService;

@Service
public class MarcaServiceImpl implements MarcaService{
	
	@Autowired
	MarcaRepository mRep;

	@Override
	public List<Marca> listaMarca() {
		return mRep.findAll();
	}
	
	

}
