package com.cibertec.veterinaria.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_tipo_mascota")
public class TipoMascota implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="codTipo_masc")
	private int codTipo_masc;
	
	@Column(name="namTipo_masc")
	private String namTipo_masc;

	public int getCodTipo_masc() {
		return codTipo_masc;
	}

	public void setCodTipo_masc(int codTipo_masc) {
		this.codTipo_masc = codTipo_masc;
	}

	public String getNamTipo_masc() {
		return namTipo_masc;
	}

	public void setNamTipo_masc(String namTipo_masc) {
		this.namTipo_masc = namTipo_masc;
	}
	
	
}
