package com.gestproy.beans;

public class IntegranteDTO {
	//Variables
	private ProyectoDTO proyectoId;
	private int integranteId;
	private String nombre;
	private String apellido;
	private String email;
	private String fechaNacimiento;
	private Character estado;
	
	
	//Constructors
	public IntegranteDTO() {
		super();
	}

	public IntegranteDTO(ProyectoDTO proyectoId, int integranteId, String nombre, String apellido, String email,
			String fechaNacimiento, Character estado) {
		super();
		this.proyectoId = proyectoId;
		this.integranteId = integranteId;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;
		this.estado = estado;
	}

	//Obtener y Establecer
	public ProyectoDTO getProyectoId() {
		return proyectoId;
	}

	public void setProyectoId(ProyectoDTO proyectoId) {
		this.proyectoId = proyectoId;
	}

	public int getIntegranteId() {
		return integranteId;
	}

	public void setIntegranteId(int integranteId) {
		this.integranteId = integranteId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Character getEstado() {
		return estado;
	}

	public void setEstado(Character estado) {
		this.estado = estado;
	}	
}
