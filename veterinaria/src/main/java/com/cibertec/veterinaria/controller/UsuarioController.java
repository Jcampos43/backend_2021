package com.cibertec.veterinaria.controller;

import java.util.List;


import com.cibertec.veterinaria.entity.Usuario;
import com.cibertec.veterinaria.service.UsuarioService;
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


@RequestMapping(value="/usuario")	
@RestController
public class UsuarioController {

    @Autowired
    UsuarioService uSer;  

    @GetMapping(value = "/listaUsuario")
	@ResponseBody
	public List<Usuario> listaUsuario(){
		return uSer.listaUsuario();
	}
		
	@PostMapping(value = "/registraCliente")
	public void registraCliente(@RequestBody Usuario bean) {
		uSer.insertaUsuario(bean);
	}
	
	@PutMapping(value = "/actualizaUsuario")
	public void actualizaUsuario(@RequestBody Usuario bean) {
		uSer.actualizaUsuario(bean);
	}
	
	@DeleteMapping(value = "/eliminaUsuario/{codigo}")
	public void eliminaUsuario(@PathVariable(name = "codigo") Integer cod) {
		uSer.eliminaUsuario(cod);
	}
	
}