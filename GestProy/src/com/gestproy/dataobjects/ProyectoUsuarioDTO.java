package com.gestproy.dataobjects;

import java.util.Date;

public class ProyectoUsuarioDTO {
	//Variables
	private ProyectoDTO proyectoId;
	private UsuarioDTO usuarioId;
	private String nombre;
	private Date fechaInicio;
	
	//Constructors
	public ProyectoUsuarioDTO() {
		super();
	}

	public ProyectoUsuarioDTO(ProyectoDTO proyectoId, UsuarioDTO usuarioId, String nombre, Date fechaInicio) {
		super();
		this.proyectoId = proyectoId;
		this.usuarioId = usuarioId;
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

	public UsuarioDTO getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(UsuarioDTO usuarioId) {
		this.usuarioId = usuarioId;
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
