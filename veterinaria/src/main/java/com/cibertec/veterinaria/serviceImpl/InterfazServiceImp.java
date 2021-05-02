package com.cibertec.veterinaria.serviceImpl;

import java.util.List;

import com.cibertec.veterinaria.entity.Interfaz;
import com.cibertec.veterinaria.repository.InterfazRepository;
import com.cibertec.veterinaria.service.InterfazService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InterfazServiceImp implements InterfazService {

    @Autowired
    InterfazRepository repository;

    @Override
    public List<Interfaz> listaInterfaz() {
		return repository.findAll();
	}

}