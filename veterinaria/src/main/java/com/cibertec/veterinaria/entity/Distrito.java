package com.cibertec.veterinaria.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_distrito")
public class Distrito implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cod_dis")
	private int cod_dis;
	
	@Column(name="nom_dis")
	private String nom_dis;

	public int getCod_dis() {
		return cod_dis;
	}

	public void setCod_dis(int cod_dis) {
		this.cod_dis = cod_dis;
	}

	public String getNom_dis() {
		return nom_dis;
	}

	public void setNom_dis(String nom_dis) {
		this.nom_dis = nom_dis;
	}

	
}
