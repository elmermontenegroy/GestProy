package com.gestproy.config.enums;
/**
 * Este enum permite definir constantes de configuracion para nuestra aplicacion app
 * @author suite701
 *
 */
public enum ConfigEnum {
	
	//MyBatis
	MYBATIS_CONFIG_FILE("com/gestproy/mybatis/config/mybatis-config.xml"),
	
	//Estados
	ESTADO_ACTIVO("Activo"),
	ESTADO_INACTIVO("Inactivo");
	
	private String parametro;
	
	private ConfigEnum(String parametro){
		this.parametro = parametro;
	}

	public String getParametro() {
		return parametro;
	}

	public void setParametro(String parametro) {
		this.parametro = parametro;
	}
	
}
