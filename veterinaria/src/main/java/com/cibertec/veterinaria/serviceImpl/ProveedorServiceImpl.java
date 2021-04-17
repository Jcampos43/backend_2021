package com.cibertec.veterinaria.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.veterinaria.entity.Proveedor;
import com.cibertec.veterinaria.repository.ProveedorRepository;
import com.cibertec.veterinaria.service.ProveedorService;

@Service
public class ProveedorServiceImpl implements ProveedorService{
	
	@Autowired
	ProveedorRepository pRep;

	@Override
	public List<Proveedor> listaProveedor() {
		return pRep.findAll();
	}
	
	

}
