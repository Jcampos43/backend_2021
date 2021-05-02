package com.cibertec.veterinaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.veterinaria.entity.TipoUsuario;
import com.cibertec.veterinaria.service.TipoUsuarioService;

@RequestMapping(value="/tipoUsuario")
@RestController
public class TipoUsuarioController {
	
	@Autowired
	TipoUsuarioService tuService;
	
	@GetMapping(value="/listaTipoUsuario")
	public List<TipoUsuario> listaTipoUsuario(){
		return tuService.listaTipoUsuario(); 
	}

}
