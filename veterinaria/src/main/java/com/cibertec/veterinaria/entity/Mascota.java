package com.cibertec.veterinaria.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
	
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name="cod_cli")
	private String cod_cli;
	
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name="codTipo_masc")
	private String codTipo_masc;

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

	public String getCod_cli() {
		return cod_cli;
	}

	public void setCod_cli(String cod_cli) {
		this.cod_cli = cod_cli;
	}

	public String getCodTipo_masc() {
		return codTipo_masc;
	}

	public void setCodTipo_masc(String codTipo_masc) {
		this.codTipo_masc = codTipo_masc;
	}

	
	
	
}
