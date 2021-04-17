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

import com.cibertec.veterinaria.entity.Cliente;
import com.cibertec.veterinaria.service.ClienteService;

@RequestMapping(value="/cliente")	
@RestController
public class ClienteController {
	
	@Autowired
	ClienteService cSer;
		
	@GetMapping(value = "/listaCliente")
	@ResponseBody
	public List<Cliente> listaCliente(){
		return cSer.listaCliente();
	}
		
	@PostMapping(value = "/registraCliente")
	public void registraCliente(@RequestBody Cliente bean) {
		cSer.insertaCliente(bean);
	}
	
	@PutMapping(value = "/actualizaCliente")
	public void actualizaCliente(@RequestBody Cliente bean) {
		cSer.actualizaCliente(bean);
	}
	
	@DeleteMapping(value = "/eliminaCliente/{cod_cli}")
	public void eliminaCliente(@PathVariable(name = "cod_cli") Integer cod) {
		cSer.eliminaCliente(cod);
	}
	
}
