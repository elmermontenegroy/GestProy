package com.gestproy.beans;

import java.util.Date;

public class DocumentoDTO {
	//Variables
	private int proyectoId;
	private int documentoId;
	private String nombre;
	private String fechaInicio; 
	
	//Constructors
	public DocumentoDTO() {
		super();
	}

	public DocumentoDTO(int proyectoId, int documentoId, String nombre, String fechaInicio) {
		super();
		this.proyectoId = proyectoId;
		this.documentoId = documentoId;
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
	}

	//Obtener y Establecer
	public int getProyectoId() {
		return proyectoId;
	}

	public void setProyectoId(int proyectoId) {
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

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}	
}
