package com.cibertec.veterinaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.veterinaria.entity.Servicio;
import com.cibertec.veterinaria.service.ServicioService;

@RequestMapping(value="/servicio")
@RestController
public class ServicioController {
	
	@Autowired
	ServicioService sSer;
	
	@GetMapping(value = "/listaServicio")
	@ResponseBody
	public List<Servicio> listaServicio(){
		return sSer.listaServicio();
	}
		
	@PostMapping(value = "/registraServicio")
	public void insertaServicio(@RequestBody Servicio bean) {
		sSer.insertaServicio(bean);
	}
	
	@PutMapping(value = "/actualizaServicio")
	public void actualizaServicio(@RequestBody Servicio bean) {
		sSer.actualizaServicio(bean);
	}
	
	@DeleteMapping(value = "/eliminaServicio/{cod_ser}")
	public void eliminaServicio(@PathVariable(name = "cod_ser") Integer cod) {
		sSer.eliminaServicio(cod);		
	}
}
	
	