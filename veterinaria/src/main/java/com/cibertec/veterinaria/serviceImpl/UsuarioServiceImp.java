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
		int num= usuarioNew.getCodigo();
		if(repository.findById(num).isPresent()) {
			Usuario usu= new Usuario();
			usu.setCodigo(usuarioNew.getCodigo());
			usu.setUser(usuarioNew.getUser());
			usu.setPass(usuarioNew.getPass());
			usu.setNombre(usuarioNew.getNombre());
			usu.setApellidos(usuarioNew.getApellidos());
			usu.setFoto(usuarioNew.getFoto());
			usu.setTipo_usuario(usuarioNew.getTipo_usuario());
			usu.setDistrito(usuarioNew.getDistrito());
			
			repository.save(usu);
			return "Usuario modificado.";
		}
		return "Ocurrió un error al modificar el cliente.";
	}
	

}
