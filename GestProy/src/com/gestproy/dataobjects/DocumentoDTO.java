package com.gestproy.dataobjects;

import java.util.Date;

public class DocumentoDTO {
	//Variables
	private ProyectoDTO proyectoId;
	private int documentoId;
	private String nombre;
	private Date fechaInicio;
	
	//Constructors
	public DocumentoDTO() {
		super();
	}

	public DocumentoDTO(ProyectoDTO proyectoId, int documentoId, String nombre, Date fechaInicio) {
		super();
		this.proyectoId = proyectoId;
		this.documentoId = documentoId;
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
	}

	//Obtener y Establecer
	public ProyectoDTO getProyectoId() {
		return proyectoId;
	}

	public void setProyectoId(ProyectoDTO proyectoId) {
		this.proyectoId = proyectoId;
	}

	public int getDocumentoId() {
		return documentoId;
	}

	public void setDocumentoId(int documentoId) {
		this.documentoId = documentoId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}	
}
