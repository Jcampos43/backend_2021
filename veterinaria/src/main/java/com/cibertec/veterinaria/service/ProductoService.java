package com.cibertec.veterinaria.service;

import java.util.List;

import com.cibertec.veterinaria.entity.Producto;

public interface ProductoService {
	public abstract List<Producto> listaProducto();
	public abstract Producto insertaProducto(Producto obj);
	public abstract String eliminaProducto(int cod_pro);
	public abstract String actualizaProducto(Producto producto);
}
