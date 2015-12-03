package com.gestproy.beans;

import java.util.Date;

public class TareaDTO {
	//Variables
	private ProyectoDTO proyecto;
	private int tareaId;
	private String descripcion;
	private String fechaInicio; 
	private String fechaFin;
	private Character estado; 
	
	//Constructors
	public TareaDTO() {
		super();
	}
		
	public TareaDTO(ProyectoDTO proyecto, int tareaId, String descripcion, String fechaInicio, String fechaFin,
			Character estado) {
		super();
		this.proyecto = proyecto;
		this.tareaId = tareaId;
		this.descripcion = descripcion;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.estado = estado;
	}


	//Obtener y Establecer
	public ProyectoDTO getProyecto() {
		return proyecto;
	}
	public void setProyecto(ProyectoDTO proyecto) {
		this.proyecto = proyecto;
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
	public String getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public String getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}
	public Character getEstado() {
		return estado;
	}
	public void setEstado(Character estado) {
		this.estado = estado;
	}	

}
