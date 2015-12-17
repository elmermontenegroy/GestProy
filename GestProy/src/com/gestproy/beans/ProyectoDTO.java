package com.gestproy.beans;

import com.gestproy.config.enums.ConfigEnum;

public class ProyectoDTO {
	//Variables

	private int proyectoId;
	private String descripcion;
	private Character estado;
	private PortafolioDTO portafolio;
	
	//Constructors
	public ProyectoDTO() {
		super();
	}

	public ProyectoDTO(int proyectoId, String descripcion, Character estado, PortafolioDTO portafolio) {
		super();
		this.proyectoId = proyectoId;
		this.descripcion = descripcion;
		this.estado = estado;
		this.portafolio = portafolio;
	}

	//Obtener y Establecer
	public String getEstadoToString(){
		if(estado!=null && estado=='A'){
			return ConfigEnum.ESTADO_ACTIVO.getParametro();
		}
		return ConfigEnum.ESTADO_INACTIVO.getParametro();
	}

	public int getProyectoId() {
		return proyectoId;
	}
	public void setProyectoId(int proyectoId) {
		this.proyectoId = proyectoId;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Character getEstado() {
		return estado;
	}
	public void setEstado(Character estado) {
		this.estado = estado;
	}
	public PortafolioDTO getPortafolio() {
		return portafolio;
	}
	public void setPortafolio(PortafolioDTO portafolio) {
		this.portafolio = portafolio;
	}
}
