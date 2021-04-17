package com.cibertec.veterinaria.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.veterinaria.entity.Producto;
import com.cibertec.veterinaria.repository.ProductoRepository;
import com.cibertec.veterinaria.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService{
	
	@Autowired
	ProductoRepository pRep;

	@Override
	public List<Producto> listaProducto() {
		return pRep.findAll();
	}

	@Override
	public Producto insertaProducto(Producto obj) {
		return pRep.save(obj);
	}

	@Override
	public String eliminaProducto(int cod_pro) {
		if(pRep.findById(cod_pro).isPresent()) {
			pRep.deleteById(cod_pro);
			return "Producto eliminado satisfactoriamente.";
		}
		return "¡Error! No existe este Producto.";
	}

	@Override
	public String actualizaProducto(Producto producto) {
		int num= producto.getCod_pro();
		if(pRep.findById(num).isPresent()) {
			Producto pro= new Producto();
			pro.setCod_pro(producto.getCod_pro());
			pro.setNom_pro(producto.getNom_pro());
			pro.setPre_pro(producto.getPre_pro());
			pro.setStock_pro(producto.getStock_pro());
			pro.setMarca(producto.getMarca());
			pro.setProveedor(producto.getProveedor());
			pro.setDesc_sim_pro(producto.getDesc_sim_pro());
			pro.setDesc_html_pro(producto.getDesc_html_pro());
			pro.setFoto1(producto.getFoto1());
			pro.setFoto2(producto.getFoto2());
			pro.setFoto3(producto.getFoto3());
			
			pRep.save(pro);
			return "Producto modificado.";
		}
		return "Ocurrió un error al modificar el Producto.";
	}
	

}
