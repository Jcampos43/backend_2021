package com.cibertec.veterinaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.veterinaria.entity.Proveedor;
import com.cibertec.veterinaria.service.ProveedorService;


@RequestMapping(value="/proveedor")
@RestController
public class ProveedorController {
	
	@Autowired
	ProveedorService pSer;
	
	@GetMapping(value="/listaProveedor")
	public List<Proveedor> listaProveedor(){
		return pSer.listaProveedor(); 
	}
}
