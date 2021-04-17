package com.cibertec.veterinaria.entity;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_proveedor")
public class Proveedor implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cod_prov")
	private int cod_prov;
	
	@Column(name="nom_prov")
	private String nom_prov;
	
	@Column(name="pat_prov")
	private String pat_prov;
	
	@Column(name="sexo_prov")
	private String sexo_prov;
	
	@Column(name="ruc_prov")
	private String ruc_prov;
	
	@Column(name="dir_prov")
	private String dir_prov;
	
	/*Metodos GET y SETTER*/
	
	public int getCod_prov() {
		return cod_prov;
	}

	public void setCod_prov(int cod_prov) {
		this.cod_prov = cod_prov;
	}

	public String getNom_prov() {
		return nom_prov;
	}

	public void setNom_prov(String nom_prov) {
		this.nom_prov = nom_prov;
	}

	public String getPat_prov() {
		return pat_prov;
	}

	public void setPat_prov(String pat_prov) {
		this.pat_prov = pat_prov;
	}

	public String getSexo_prov() {
		return sexo_prov;
	}

	public void setSexo_prov(String sexo_prov) {
		this.sexo_prov = sexo_prov;
	}

	public String getRuc_prov() {
		return ruc_prov;
	}

	public void setRuc_prov(String ruc_prov) {
		this.ruc_prov = ruc_prov;
	}

	public String getDir_prov() {
		return dir_prov;
	}

	public void setDir_prov(String dir_prov) {
		this.dir_prov = dir_prov;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
