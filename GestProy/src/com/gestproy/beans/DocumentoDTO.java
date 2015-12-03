package com.gestproy.beans;

import java.util.Date;

public class DocumentoDTO {
	//Variables
	private ProyectoDTO proyecto;
	private int documentoId;
	private String nombre;
	private String fechaInicio; 
	
	//Constructors
	public DocumentoDTO() {
		super();
	}

	public DocumentoDTO(ProyectoDTO proyecto, int documentoId, String nombre, String fechaInicio) {
		super();
		this.proyecto = proyecto;
		this.documentoId = documentoId;
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
	}

	//Obtener y Establecer

	public int getDocumentoId() {
		return documentoId;
	}

	public ProyectoDTO getProyecto() {
		return proyecto;
	}

	public void setProyecto(ProyectoDTO proyecto) {
		this.proyecto = proyecto;
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
