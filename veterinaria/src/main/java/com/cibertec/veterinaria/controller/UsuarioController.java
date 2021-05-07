package com.cibertec.veterinaria.controller;

import java.util.List;

import com.cibertec.veterinaria.entity.Usuario;
import com.cibertec.veterinaria.service.UsuarioService;
import com.cibertec.veterinaria.util.ExcepcionUtil;
import com.cibertec.veterinaria.util.RespuestaWeb;
import com.cibertec.veterinaria.util.TipoRespuestaWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
		
	@PostMapping(value = "/registraUsuario")
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
	
	@PostMapping(value="/login")
	public ResponseEntity<?> login(@RequestBody Usuario usuario) {
		RespuestaWeb respuestaWeb = new RespuestaWeb();
		Usuario u = new Usuario();
		try {
			boolean resultado=false;
			u = uSer.login(usuario.getDni_usu(), usuario.getPass_usu());
			if(u==null) {
				respuestaWeb.setTipoRespuesta(TipoRespuestaWeb.VACIO);
			}
			else {
				respuestaWeb.setTipoRespuesta(TipoRespuestaWeb.CORRECTA);	
				resultado=true;
			}
			respuestaWeb.getParametros().put("usuario", u);
			respuestaWeb.getParametros().put("resultado", resultado);
			return ResponseEntity.ok(respuestaWeb);

		}catch(Exception excepcion) {
			return ResponseEntity.badRequest().body(ExcepcionUtil.controlar(excepcion));
		}
	}
	
	/*@GetMapping("/iniciarSesion/{dni_usu}/{pass_usu}")
	public Usuario obtenerUsuario(@PathVariable("dni_usu") String dni_usu,@PathVariable("pass_usu") String pass_usu) {
		return uSer.iniciarSesion(dni_usu, pass_usu);
	}*/
}