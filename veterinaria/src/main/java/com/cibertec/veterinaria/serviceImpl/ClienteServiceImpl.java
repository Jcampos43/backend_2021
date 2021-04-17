package com.cibertec.veterinaria.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.veterinaria.entity.Cliente;
import com.cibertec.veterinaria.repository.ClienteRepository;
import com.cibertec.veterinaria.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{
	
	@Autowired
	ClienteRepository cRep;

	@Override
	public List<Cliente> listaCliente() {
		return cRep.findAll();
	}

	@Override
	public Cliente insertaCliente(Cliente obj) {
		return cRep.save(obj);
	}

	@Override
	public String eliminaCliente(int cod_cli) {
		if(cRep.findById(cod_cli).isPresent()) {
			cRep.deleteById(cod_cli);
			return "Cliente eliminado satisfactoriamente.";
		}
		return "¡Error! No existe este cliente.";
	}

	@Override
	public String actualizaCliente(Cliente clienteNew) {
		int num= clienteNew.getCod_cli();
		if(cRep.findById(num).isPresent()) {
			Cliente cl= new Cliente();
			cl.setCod_cli(clienteNew.getCod_cli());
			cl.setNom_cli(clienteNew.getNom_cli());
			cl.setApe_cli(clienteNew.getApe_cli());
			cl.setDni_cli(clienteNew.getDni_cli());
			cl.setSexo_cli(clienteNew.getSexo_cli());
			cl.setDistrito(clienteNew.getDistrito());
			
			cRep.save(cl);
			return "Cliente modificado.";
		}
		return "Ocurrió un error al modificar el cliente.";
	}
	

}
