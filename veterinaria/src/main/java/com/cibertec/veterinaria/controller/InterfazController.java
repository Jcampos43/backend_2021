package com.cibertec.veterinaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.veterinaria.entity.Interfaz;
import com.cibertec.veterinaria.service.InterfazService;


@RequestMapping(value="/interfaz")
@RestController
public class InterfazController {
	
	@Autowired
	InterfazService iSer;
	
	@GetMapping(value="/listaInterfaz")
	public List<Interfaz> listaInterfaz(){
		return iSer.listaInterfaz(); 
	}
}
