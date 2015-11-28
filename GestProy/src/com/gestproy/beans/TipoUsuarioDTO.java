package com.gestproy.beans;

public class TipoUsuarioDTO {
	//Variables
	private int tipoUsuarioId;
	private String descripcion;
	
	//Constructors
	public TipoUsuarioDTO() {
		super();
	}

	public TipoUsuarioDTO(int tipoUsuarioId, String descripcion) {
		super();
		this.tipoUsuarioId = tipoUsuarioId;
		this.descripcion = descripcion;
	}
	
	//Obtener y Establecer
	public int getTipoUsuarioId() {
		return tipoUsuarioId;
	}

	public void setTipoUsuarioId(int tipoUsuarioId) {
		this.tipoUsuarioId = tipoUsuarioId;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
