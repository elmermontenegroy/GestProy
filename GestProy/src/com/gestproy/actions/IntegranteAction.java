package com.gestproy.actions;

import java.util.List;

import com.gestproy.beans.IntegranteDTO;
import com.gestproy.beans.ProyectoDTO;
import com.gestproy.beans.TipoUsuarioDTO;
import com.gestproy.beans.UsuarioDTO;
import com.gestproy.service.IntegranteService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class IntegranteAction extends ActionSupport implements Preparable{
	
	private static final long serialVersionUID = 1470228705843594914L;
	
	//variables
	private String cboBusqueda;
	private String txtBusqueda;
	private String txtEliminar;
	private IntegranteDTO integrante;
	private List<IntegranteDTO> integrantes;
	private List<ProyectoDTO> proyectos;
	//Implementaciones
	
	//servicios
	IntegranteService servicioIntegrante = new IntegranteService();
	@Override
	public void prepare() throws Exception {
		
	}
	
	//Metodos de Mantenimiento
	public String cargarRegistrar(){
		integrante = new IntegranteDTO();
		integrante.setProyectoId(new ProyectoDTO());
		integrante.getProyectoId().setProyectoId(1);
		integrante.setEstado('A');
		return SUCCESS;
	}
	public String cargarActualizar(){
		integrante = servicioIntegrante.obtenerIntegrante(integrante.getIntegranteId());
		return SUCCESS;
	}

	public String registrar(){
		servicioIntegrante.registrarIntegrante(integrante);
		if(integrante.getIntegranteId()>0){
			integrantes = servicioIntegrante.listarIntegrantes(new IntegranteDTO());
			return SUCCESS;
		}
		return ERROR;
	}
	public String actualizar(){
		servicioIntegrante.actualizarIntegrante(integrante);
		integrantes = servicioIntegrante.listarIntegrantes(new IntegranteDTO());
		return SUCCESS;
	}
	public String listar(){
		return "";
	}
	public String eliminar(){
		servicioIntegrante.eliminarIntegrantes(txtEliminar);
		integrantes = servicioIntegrante.listarIntegrantes(new IntegranteDTO());
		return SUCCESS;
	}
	private boolean validar(){
		return true;
	}
	//Metodos de Reporte
	
	//Obtener y Establecer
	
}
