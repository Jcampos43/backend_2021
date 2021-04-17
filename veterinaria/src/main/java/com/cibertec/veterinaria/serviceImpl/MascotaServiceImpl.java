package com.cibertec.veterinaria.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.veterinaria.entity.Mascota;
import com.cibertec.veterinaria.repository.MascotaRepository;
import com.cibertec.veterinaria.service.MascotaService;

@Service
public class MascotaServiceImpl implements MascotaService{

	@Autowired
	MascotaRepository mRep;

	@Override
	public List<Mascota> listaMascota() {
		return mRep.findAll();
	}

	@Override
	public Mascota insertaMascota(Mascota obj) {
		return mRep.save(obj);
	}

	@Override
	public String eliminaMascota(int cod_mas) {
		if(mRep.findById(cod_mas).isPresent()) {
			mRep.deleteById(cod_mas);
			return "Mascota eliminada satisfactoriamente.";
		}
		return "¡Error! No existe esta mascota.";
	}

	@Override
	public String actualizaMascota(Mascota MascotaNew) {
		int num= MascotaNew.getCod_mas();
		if(mRep.findById(num).isPresent()) {
			Mascota m= new Mascota();
			m.setCod_mas(MascotaNew.getCod_mas());
			m.setNom_mas(MascotaNew.getNom_mas());
			m.setCod_cli(MascotaNew.getCod_cli());
			m.setCodTipo_masc(MascotaNew.getCodTipo_masc());
			mRep.save(m);
			return "Mascota modificada.";
		}
		return "Ocurrió un error al modificar a la mascota.";
	}
	
}
