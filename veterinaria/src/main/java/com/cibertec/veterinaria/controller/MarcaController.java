package com.cibertec.veterinaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.veterinaria.entity.Marca;
import com.cibertec.veterinaria.service.MarcaService;


@RequestMapping(value="/marca")
@RestController
public class MarcaController {
	
	@Autowired
	MarcaService mSer;
	
	@GetMapping(value="/listaMarca")
	public List<Marca> listaMarca(){
		return mSer.listaMarca(); 
	}
}
