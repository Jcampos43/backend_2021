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
@Table(name="tb_interfaz")
public class Interfaz implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_int")
    private int cod_int;
    
	@Column(name="des_int")
	private String des_int;
		
	@Column(name="url_int")
	private String url_int;
	
    @ManyToOne
	@JoinColumn(name="cod_tip_usu")
    private TipoUsuario tipoUsuario;
    
    /*METODOS GETTER Y SETTER*/

	public int getCod_int() {
		return cod_int;
	}

	public void setCod_int(int cod_int) {
		this.cod_int = cod_int;
	}

	public String getDes_int() {
		return des_int;
	}

	public void setDes_int(String des_int) {
		this.des_int = des_int;
	}

	public String getUrl_int() {
		return url_int;
	}

	public void setUrl_int(String url_int) {
		this.url_int = url_int;
	}

	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}    
	    
}