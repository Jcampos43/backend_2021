package com.cibertec.veterinaria.util;


public enum TipoRespuestaWeb {
	CORRECTA(2, "La accion se ha ejecutado correctamente."),
	REGISTRO(1, "Los datos se registraron correctamente."),
	INCORRECTO(3,"No se modificaron o insertaron datos"),
	VACIO(0,"No se encontraron registros"),
	ERROR(-1, "OcurriÃ³ un error inesperado con ID {0}, por favor informar al Ã¡rea correspondiente."),
	PARAMATETRO_INCORRECTO(4, "Los parametros enviados en la solicitud al servicio no son validos para esta consulta.");
	
	private final int codigo;

	private final String mensaje;

	private TipoRespuestaWeb(int codigo, String mensaje) {
		this.codigo = codigo;
		this.mensaje = mensaje;
	}	

	public int getCodigo() {
		return codigo;
	}

	public String getMensaje() {
		return mensaje;
	}
}

