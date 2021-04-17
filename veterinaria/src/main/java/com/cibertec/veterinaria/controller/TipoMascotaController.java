package com.cibertec.veterinaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.veterinaria.entity.TipoMascota;
import com.cibertec.veterinaria.service.TipoMascotaService;

@RequestMapping(value="/tipoMascota")
@RestController
public class TipoMascotaController {
	
	@Autowired
	TipoMascotaService tmService;
	
	@GetMapping(value="/listaTipoMascota")
	public List<TipoMascota> listaTipoMascota(){
		return tmService.listaTipoMascota(); 
	}

}
