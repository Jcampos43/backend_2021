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
@Table(name="tb_usuario")
public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;
	    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_usu")
    private int cod_usu;
    
    @Column(name="nom_usu")
	private String nom_usu;
    
    @Column(name="ape_usu")
	private String ape_usu;
    
    @Column(name="dni_usu")
	private String dni_usu;
    
    @Column(name="pass_usu")
	private String pass_usu;
    
    @ManyToOne
    @JoinColumn(name="cod_tip_usu")
	private TipoUsuario tipoUsuario;
    
    @ManyToOne
	@JoinColumn(name="cod_dis")
	private Distrito distrito;
    
    
    /*METODOS GETTER Y SETTER*/

	public int getCod_usu() {
		return cod_usu;
	}

	public void setCod_usu(int cod_usu) {
		this.cod_usu = cod_usu;
	}

	public String getNom_usu() {
		return nom_usu;
	}

	public void setNom_usu(String nom_usu) {
		this.nom_usu = nom_usu;
	}

	public String getApe_usu() {
		return ape_usu;
	}

	public void setApe_usu(String ape_usu) {
		this.ape_usu = ape_usu;
	}

	public String getDni_usu() {
		return dni_usu;
	}

	public void setDni_usu(String dni_usu) {
		this.dni_usu = dni_usu;
	}

	public String getPass_usu() {
		return pass_usu;
	}

	public void setPass_usu(String pass_usu) {
		this.pass_usu = pass_usu;
	}

	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public Distrito getDistrito() {
		return distrito;
	}

	public void setDistrito(Distrito distrito) {
		this.distrito = distrito;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}