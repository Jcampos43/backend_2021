package com.cibertec.veterinaria.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.veterinaria.entity.TipoUsuario;
import com.cibertec.veterinaria.repository.TipoUsuarioRepository;
import com.cibertec.veterinaria.service.TipoUsuarioService;

@Service
public class TipoUsuarioServiceImpl implements TipoUsuarioService{

	@Autowired
	TipoUsuarioRepository tuRep;
	
	@Override
	public List<TipoUsuario> listaTipoUsuario() {
		return tuRep.findAll();
	}

}
