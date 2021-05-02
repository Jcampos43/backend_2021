package com.cibertec.veterinaria.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_mascota")
public class Mascota implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cod_mas")
	private int cod_mas;
	
	@Column(name="nom_mas")
	private String nom_mas;
	
	@ManyToOne
	@JoinColumn(name="codigo")
	private Usuario cliente;
	
	@ManyToOne
	@JoinColumn(name="codTipo_masc")
	private TipoMascota tipoMascota;

	public int getCod_mas() {
		return cod_mas;
	}

	public void setCod_mas(int cod_mas) {
		this.cod_mas = cod_mas;
	}

	public String getNom_mas() {
		return nom_mas;
	}

	public void setNom_mas(String nom_mas) {
		this.nom_mas = nom_mas;
	}

	public Usuario getUsuario() {
		return cliente;
	}

	public void setUsuario(Usuario cliente) {
		this.cliente = cliente;
	}

	public TipoMascota getTipoMascota() {
		return tipoMascota;
	}

	public void setTipoMascota(TipoMascota tipoMascota) {
		this.tipoMascota = tipoMascota;
	}
	
	
	
}
