package com.gestproy.dataobjects;

public class ProyectoDTO {
	//Variables
	private PortafolioDTO portafolio;
	private int proyectoId;
	private String descripcion;
	private Character estado;
	
	//Constructors
	public ProyectoDTO() {
		super();
	}
	public ProyectoDTO(int proyectoId, String descripcion, Character estado) {
		super();
		this.proyectoId = proyectoId;
		this.descripcion = descripcion;
		this.estado = estado;
	}
	
	//Obtener y Establecer
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

}
