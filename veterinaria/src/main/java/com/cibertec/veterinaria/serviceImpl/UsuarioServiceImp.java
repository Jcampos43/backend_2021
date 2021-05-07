package com.cibertec.veterinaria.serviceImpl;
import com.cibertec.veterinaria.entity.Usuario;
import com.cibertec.veterinaria.repository.UsuarioRepository;
import com.cibertec.veterinaria.service.UsuarioService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsuarioServiceImp implements UsuarioService {
		
    @Autowired
    UsuarioRepository repository;
    
    @Override
	public List<Usuario> listaUsuario() {
		return repository.findAll();
	}

	@Override
	public Usuario insertaUsuario(Usuario obj) {
		return repository.save(obj);
	}

	@Override
	public String eliminaUsuario(int codigo) {
		if(repository.findById(codigo).isPresent()) {
			repository.deleteById(codigo);
			return "Usuario eliminado satisfactoriamente.";
		}
		return "¡Error! No existe este usuario.";
	}

	@Override
	public String actualizaUsuario(Usuario usuarioNew) {
		int num= usuarioNew.getCod_usu();
		if(repository.findById(num).isPresent()) {
			Usuario usu= new Usuario();
			usu.setCod_usu(usuarioNew.getCod_usu());
			usu.setNom_usu(usuarioNew.getNom_usu());
			usu.setApe_usu(usuarioNew.getApe_usu());
			usu.setDni_usu(usuarioNew.getDni_usu());
			usu.setPass_usu(usuarioNew.getPass_usu());
			usu.setTipoUsuario(usuarioNew.getTipoUsuario());
			usu.setDistrito(usuarioNew.getDistrito());
			
			repository.save(usu);
			return "Usuario modificado.";
		}
		return "Ocurrió un error al modificar el usuario.";
	}

	@Override
	public Usuario login(String param_dni, String param_pass) {
		return repository.login(param_dni, param_pass);
	}
	
	/*@Override
	public Usuario iniciarSesion(String dni_usu, String pass_usu) {
		return repository.iniciarSesion(dni_usu, pass_usu);
	}*/

}
