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

import com.cibertec.veterinaria.entity.Producto;
import com.cibertec.veterinaria.service.ProductoService;

@RequestMapping(value="/producto")
@RestController
public class ProductoController {
	
	@Autowired
	ProductoService pSer;
	
	@GetMapping(value = "/listaProducto")
	@ResponseBody
	public List<Producto> listaProducto(){
		return pSer.listaProducto();
	}
		
	@PostMapping(value = "/registraProducto")
	public void insertaProducto(@RequestBody Producto bean) {
		pSer.insertaProducto(bean);
	}
	
	@PutMapping(value = "/actualizaProducto")
	public void actualizaProducto(@RequestBody Producto bean) {
		pSer.actualizaProducto(bean);
	}
	
	@DeleteMapping(value = "/eliminaProducto/{cod_pro}")
	public void eliminaProducto(@PathVariable(name = "cod_pro") Integer cod) {
		pSer.eliminaProducto(cod);
		
	}
	
}
