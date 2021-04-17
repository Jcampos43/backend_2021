package com.cibertec.veterinaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.veterinaria.entity.Distrito;
import com.cibertec.veterinaria.service.DistritoService;


@RequestMapping(value="/distrito")
@RestController
public class DistritoController {
	
	@Autowired
	DistritoService dSer;
	
	@GetMapping(value="/listaDistrito")
	public List<Distrito> listaDistrito(){
		return dSer.listaDistrito(); 
	}
}
