package com.cibertec.veterinaria.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.veterinaria.entity.Servicio;
import com.cibertec.veterinaria.repository.ServicioRepository;
import com.cibertec.veterinaria.service.ServicioService;

@Service
public class ServicioServiceImpl implements ServicioService{
	
	@Autowired
	ServicioRepository sRep;

	@Override
	public List<Servicio> listaServicio() {
		return sRep.findAll();
	}

	@Override
	public Servicio insertaServicio(Servicio obj) {
		return sRep.save(obj);
	}

	@Override
	public String eliminaServicio(int cod_ser) {
		if(sRep.findById(cod_ser).isPresent()) {
			sRep.deleteById(cod_ser);
			return "Servicio eliminado satisfactoriamente.";
		}
		return "¡Error! No existe este Servicio.";
	}

	@Override
	public String actualizaServicio(Servicio servicio) {
		int num= servicio.getCod_ser();
		if(sRep.findById(num).isPresent()) {
			Servicio se= new Servicio();
			se.setCod_ser(servicio.getCod_ser());
			se.setNom_ser(servicio.getNom_ser());
			se.setPre_ser(servicio.getPre_ser());
			se.setDesc_ser(servicio.getDesc_ser());
			se.setHorio_ser(servicio.getHorio_ser());
			se.setFec_ser(servicio.getFec_ser());
			
			sRep.save(se);
			return "Servicio modificado.";
		}
		return "Ocurrió un error al modificar el Servicio.";
	}
	

}
