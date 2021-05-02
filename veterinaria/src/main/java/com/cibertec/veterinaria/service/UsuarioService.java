package com.cibertec.veterinaria.service;

import java.util.List;

import com.cibertec.veterinaria.entity.Usuario;

public interface UsuarioService {

    //public abstract Usuario iniciarSesion(String login, String pass);
    public abstract List<Usuario> listaUsuario();
	public abstract Usuario insertaUsuario(Usuario obj);
	public abstract String eliminaUsuario(int codigo);
	public abstract String actualizaUsuario(Usuario usuarioNew);
    
}