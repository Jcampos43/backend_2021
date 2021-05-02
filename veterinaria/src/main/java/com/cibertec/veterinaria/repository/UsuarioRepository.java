package com.cibertec.veterinaria.repository;

import com.cibertec.veterinaria.entity.Usuario;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
	@Query(value="select u.codigo, u.nombre, u.apellidos, "
			+ "u.tipo_usuario, u.dni, u.cod_dis, u.pass from tb_usuario "
			+ "u where u.dni = :param_dni and u.pass = :param_pass",nativeQuery = true)
	public abstract Usuario login(@Param("param_dni") int param_dni, @Param("param_pass") String param_pass);
}