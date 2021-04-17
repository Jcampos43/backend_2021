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

import com.cibertec.veterinaria.entity.Mascota;
import com.cibertec.veterinaria.service.MascotaService;

@RequestMapping(value="/mascota")
@RestController
public class MascotaController {

	@Autowired
	MascotaService mSer;
	
	@GetMapping(value = "/listaMascota")
	@ResponseBody
	public List<Mascota> listaMascota(){
		return mSer.listaMascota();
	}
		
	@PostMapping(value = "/registraMascota")
	public void registraMascota(@RequestBody Mascota bean) {
		mSer.insertaMascota(bean);
	}
	
	@PutMapping(value = "/actualizaMascota")
	public void actualizaMascota(@RequestBody Mascota bean) {
		mSer.actualizaMascota(bean);
	}
	
	@DeleteMapping(value = "/eliminaMascota/{cod_mas}")
	public void eliminaMascota(@PathVariable(name = "cod_mas") Integer cod) {
		mSer.eliminaMascota(cod);
	}
}
