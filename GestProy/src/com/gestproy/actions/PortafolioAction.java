package com.gestproy.actions;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.gestproy.beans.UsuarioDTO;
import com.gestproy.util.Constantes;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class PortafolioAction extends ActionSupport implements Preparable{
	
	private static final long serialVersionUID = 1470228705843594914L;
	
	//variables
	
	//Implementaciones
	
	@Override
	public void prepare() throws Exception {
		
	}
	
	//Metodos de Mantenimiento
	public String cargarRegistrar(){
		return "";
	}
	public String cargarActualizar(){
		return "";
	}
	public String registrar(){
		return "";
	}
	public String actualizar(){
		return "";
	}
	public String listar(){
		return "";
	}
	public String eliminar(){
		return "";
	}
	private boolean validar(){
		return true;
	}
	//Metodos de Reporte
	
	//Obtener y Establecer
	
}
