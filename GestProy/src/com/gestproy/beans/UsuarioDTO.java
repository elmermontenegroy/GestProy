package com.gestproy.beans;

import java.util.Date;

public class UsuarioDTO {
	//Variables
	private int usuarioId;
	private String usuario;
	private String clave;
	private String email;
	private String nombre;
	private String apellido;
	private String fechaNacimiento;
	private int tipoUsuario;
	private Character estado;
	
	//Constructors
	public UsuarioDTO() {
		super();
	}
	
	public UsuarioDTO(int usuarioId, String usuario, String clave, String email, String nombre, String apellido,
			String fechaNacimiento, int tipoUsuario, Character estado) {
		super();
		this.usuarioId = usuarioId;
		this.usuario = usuario;
		this.clave = clave;
		this.email = email;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.tipoUsuario = tipoUsuario;
		this.estado = estado;
	}


	//Obtener y Establecer
	public int getUsuarioId() {
		return usuarioId;
	}
	public void setUsuarioId(int usuarioId) {
		this.usuarioId = usuarioId;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public int getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(int tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	public Character getEstado() {
		return estado;
	}
	public void setEstado(Character estado) {
		this.estado = estado;
	}
	
}
