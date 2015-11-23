package com.gestproy.dataobjects;

import java.util.Date;

public class TareasDTO {
	//Variables
	private ProyectoDTO proyectoId;
	private int tareaId;
	private String descripcion;
	private Date fechaInicio;
	private Date fechaFin;
	private Character estado;
	
	//Constructors
	public TareasDTO() {
		super();
	}
	public TareasDTO(ProyectoDTO proyectoId, int tareaId, String descripcion, Date fechaInicio, Date fechaFin,
			Character estado) {
		super();
		this.proyectoId = proyectoId;
		this.tareaId = tareaId;
		this.descripcion = descripcion;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.estado = estado;
	}
	
	//Obtener y Establecer
	public ProyectoDTO getProyectoId() {
		return proyectoId;
	}
	public void setProyectoId(ProyectoDTO proyectoId) {
		this.proyectoId = proyectoId;
	}
	public int getTareaId() {
		return tareaId;
	}
	public void setTareaId(int tareaId) {
		this.tareaId = tareaId;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	public Character getEstado() {
		return estado;
	}
	public void setEstado(Character estado) {
		this.estado = estado;
	}	

}
