package com.gestproy.dataobjects;

import java.io.Serializable;

/**
 * Esta clase representa a la entidad registrada en "tb_empleado"
 * @author suite701
 *
 */
public class EmpleadoDTO implements Serializable{
	//El valor 1L se debe cambiar en base a la version y revision
	// y es usado para cuando de 2 a mas proyectos que usen un jar con esta clase
	// deben hacer match que es una manera de identificar que tienen la clase es actualizada
	private static final long serialVersionUID = 1L;
	
	//Propiedades (columnas)
	private int codigo;
	private String nombre;
	private String apellido;
	private int edad;
	private double salario;
	
	//Getters and Setters
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString(){
		StringBuilder reporteador = new StringBuilder();
		reporteador.append("[codigo: ");
		reporteador.append(this.codigo);
		reporteador.append(", nombre: ");
		reporteador.append(this.nombre);
		reporteador.append(", apellido: ");
		reporteador.append(this.apellido);
		reporteador.append(", edad: ");
		reporteador.append(this.edad);
		reporteador.append(", salario: ");
		reporteador.append(this.salario);
		reporteador.append("]");
		return reporteador.toString();
	}
	
}
