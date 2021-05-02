package com.cibertec.veterinaria.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.jasper.runtime.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static java.text.MessageFormat.format;


public class ExcepcionUtil {
	private static final Logger LOGGER = LoggerFactory.getLogger(ExcepcionUtil.class);

public static RespuestaWeb controlar(Exception excepcion){
		
		String idError = generarCodigoError();
		
		mostrarMensajeEnConsola(excepcion, idError);
		
		RespuestaWeb respuestaWeb = new RespuestaWeb();
		respuestaWeb.setTipoRespuesta(TipoRespuestaWeb.ERROR, idError);
		respuestaWeb.setMensajeRespuesta(format("Codigo Error: {0} - Se ha producido una operación inválida, espere unos momentos e intente nuevamente.", idError));
		return respuestaWeb;
	}
	private static String generarCodigoError() {
		return new SimpleDateFormat("ddMMyyyyhhmmss").format(new Date());
	}
	
	private static void mostrarMensajeEnConsola(Exception excepcion, String idError) {
		
		StringBuffer mensaje = new StringBuffer();
		mensaje.append(format("Codigo Error: {0}", idError));
		
		LOGGER.error(mensaje.toString(), excepcion);
		
	}
}
