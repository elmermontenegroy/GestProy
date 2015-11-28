package com.gestproy.beans;

public class PortafolioDTO {
	//Variables
	private int portafolioId;
	private String descripcion;
	private Character estado;
	
	//Constructors
	public PortafolioDTO() {
		super();
	}

	public PortafolioDTO(int portafolioId, String descripcion, Character estado) {
		super();
		this.portafolioId = portafolioId;
		this.descripcion = descripcion;
		this.estado = estado;
	}
	
	//Obtener y Establecer
	public int getPortafolioId() {
		return portafolioId;
	}

	public void setPortafolioId(int portafolioId) {
		this.portafolioId = portafolioId;
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
