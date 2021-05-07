package com.cibertec.veterinaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.veterinaria.entity.Interfaz;
import com.cibertec.veterinaria.service.InterfazService;


@RequestMapping(value="/interfaz")
@RestController
public class InterfazController {
	
	@Autowired
	InterfazService iSer;
	
	@GetMapping(value="/listaInterfaz/{cod_tip_usu}")
	public List<Interfaz> listaInterfaz(@PathVariable(name = "cod_tip_usu") int cod_tip_usu){
		return iSer.listaInterfaz(cod_tip_usu); 
	}
}
