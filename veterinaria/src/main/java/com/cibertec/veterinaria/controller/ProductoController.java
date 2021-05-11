package com.cibertec.veterinaria.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cibertec.veterinaria.entity.Producto;
import com.cibertec.veterinaria.service.ProductoService;
import com.cibertec.veterinaria.util.TipoRespuestaWeb;

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
		
	@PostMapping(value = "/registraProducto", consumes = "multipart/form-data")
	public Map<String, Object> insertaProducto(@RequestParam("nom_pro") String nom_pro,@RequestParam("pre_pro") String pre_pro, 
												@RequestParam("stock_pro") String stock_pro,@RequestParam("desc_sim_pro") String desc_sim_pro,
												@RequestParam("foto1")MultipartFile imagen1,@RequestParam("foto2")MultipartFile imagen2, 
												@RequestParam("foto3")MultipartFile imagen3) {
		Map<String, Object> salida=new HashMap<>();
		
		try {
			Producto bean = new Producto();
			bean.setNom_pro(nom_pro);
			bean.setPre_pro(pre_pro);
			bean.setStock_pro(stock_pro);
			bean.setDesc_sim_pro(desc_sim_pro);
			bean.setFoto1(imagen1.getBytes());
			bean.setFoto2(imagen2.getBytes());
			bean.setFoto3(imagen3.getBytes());
			List<Producto> lstProd = pSer.listaProducto();
			if(CollectionUtils.isEmpty(lstProd)) {
				Producto objSalida = pSer.insertaProducto(bean);
				if(objSalida==null) {
					salida.put("mensaje", TipoRespuestaWeb.INCORRECTO);
				}else {
					salida.put("mensaje", TipoRespuestaWeb.CORRECTA);
				}
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", TipoRespuestaWeb.ERROR);
		}
		
		return salida;
		
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
