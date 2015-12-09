package com.gestproy.actions;

import java.util.List;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.gestproy.beans.DocumentoDTO;
import com.gestproy.beans.PortafolioDTO;
import com.gestproy.beans.UsuarioDTO;
import com.gestproy.service.DocumentoService;
import com.gestproy.service.PortafolioService;
import com.gestproy.util.Constantes;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class PortafolioAction extends ActionSupport implements Preparable{
	
	private static final long serialVersionUID = 1470228705843594914L;
	
	//variables
	private PortafolioDTO portafolio = new PortafolioDTO();
	private List<PortafolioDTO> portafolios;
	PortafolioService servicioPortafolio = new PortafolioService();
	

	//Implementaciones
	@Override
	public void prepare() throws Exception {
		this.portafolios = servicioPortafolio.listarPortafolios(getPortafolio());
	}


	//Metodos de Mantenimiento
	public String cargarRegistrar(){
		return SUCCESS;
	}
	
	public String cargarActualizar(){
		System.out.println("codigo: "+this.portafolio.getPortafolioId());
		for(PortafolioDTO c : portafolios){
			if(c.getPortafolioId() == this.portafolio.getPortafolioId()){
				portafolio = c;
			}
		}
		return SUCCESS;
	}
	public String registrar(){
		servicioPortafolio.registrarPortafolio(getPortafolio());
		this.portafolios = servicioPortafolio.listarPortafolios(getPortafolio());
		return SUCCESS;
	}
	
	public String actualizar(){
		servicioPortafolio.actualizarPortafolio(getPortafolio());
		this.portafolios = servicioPortafolio.listarPortafolios(getPortafolio());
		return SUCCESS;
	}
	public String listar(){
		this.portafolios = servicioPortafolio.listarPortafolios(getPortafolio());
		return SUCCESS;
	}
	public String eliminar(){
		servicioPortafolio.eliminarPortafolio(getPortafolio().getPortafolioId());
		this.portafolios = servicioPortafolio.listarPortafolios(getPortafolio());
		return SUCCESS;
	}
	private boolean validar(){
		return true;
	}
	//Metodos de Reporte
	
	//Obtener y Establecer
	

	public PortafolioDTO getPortafolio() {
		return portafolio;
	}

	public void setPortafolio(PortafolioDTO portafolio) {
		this.portafolio = portafolio;
	}

	public List<PortafolioDTO> getPortafolios() {
		return portafolios;
	}

	public void setPortafolios(List<PortafolioDTO> portafolios) {
		this.portafolios = portafolios;
	}
}
