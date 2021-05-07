package com.cibertec.veterinaria.repository;

import com.cibertec.veterinaria.entity.Usuario;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
	@Query(value="select u.* from tb_usuario u "
			+ "where u.dni_usu = :param_dni and u.pass_usu = :param_pass",nativeQuery = true)
	public abstract Usuario login(@Param("param_dni") String param_dni, @Param("param_pass") String param_pass);
	
	//@Query("select u from Usuario u where u.dni_usu = ?1 and u.pass_usu = ?2")
	  //public Usuario iniciarSesion(String dni_usu,String password);
}