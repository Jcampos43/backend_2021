package com.cibertec.veterinaria.service;

import java.util.List;

import com.cibertec.veterinaria.entity.Cliente;

public interface ClienteService {
	public abstract List<Cliente> listaCliente();
	public abstract Cliente insertaCliente(Cliente obj);
	public abstract String eliminaCliente(int cod_cli);
	public abstract String actualizaCliente(Cliente clienteNew);
}
