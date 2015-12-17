package com.gestproy.actions;

import java.util.List;

import org.apache.struts2.dispatcher.SessionMap;

import com.gestproy.beans.PortafolioDTO;
import com.gestproy.beans.ProyectoDTO;
import com.gestproy.service.PortafolioService;
import com.gestproy.service.ProyectoService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class ProyectoAction  extends ActionSupport implements Preparable {
	
	private static final long serialVersionUID = 1470228705843594914L;
	
	// variables
	private String cboBusqueda;
	private String txtBusqueda;
	private String txtEliminar;
	private ProyectoDTO proyecto;
	private SessionMap<String, Object> session;
	private List<ProyectoDTO> proyectos;
	private List<PortafolioDTO> portafolios;

	// servicios
	ProyectoService servicioProyecto = new ProyectoService();
	PortafolioService servicioPortafolio = new PortafolioService();

	//Prepare
	@Override
	public void prepare() throws Exception {
		proyectos = servicioProyecto.listarProyectos(new ProyectoDTO());
		portafolios = servicioPortafolio.listarPortafolios(new PortafolioDTO());
	}

	// Metodos de Mantenimiento
	public String cargarRegistrar() {
		proyecto = new ProyectoDTO();
		proyecto.setPortafolio(new PortafolioDTO());
		proyecto.getPortafolio().setPortafolioId(1);
		proyecto.setEstado('A');
		return SUCCESS;
	}

	public String cargarActualizar() {
		proyecto = servicioProyecto.obtenerProyecto(proyecto.getProyectoId());
		return SUCCESS;
	}

	public String buscar() {
		ProyectoDTO proyecto = new ProyectoDTO();
		switch (cboBusqueda) {
		case "0":
			proyecto.setDescripcion(txtBusqueda);
			break;
		case "1":
			proyecto.setEstado(txtBusqueda.charAt(0));
			break;
		}
		proyectos = servicioProyecto.listarProyectos(proyecto);
		return SUCCESS;
	}

	public String registrar() {
		servicioProyecto.registrarProyecto(proyecto);
		if (proyecto.getProyectoId() > 0) {
			proyectos = servicioProyecto.listarProyectos(new ProyectoDTO());
			return SUCCESS;
		}
		return ERROR;
	}

	public String actualizar() {
		servicioProyecto.actualizarProyecto(proyecto);
		proyectos = servicioProyecto.listarProyectos(new ProyectoDTO());
		return SUCCESS;
	}

	public String eliminar() {
		servicioProyecto.eliminarProyectos(txtEliminar);
		proyectos = servicioProyecto.listarProyectos(new ProyectoDTO());
		return SUCCESS;
	}

	private boolean validar() {
		return true;
	}

	// Metodos de Reporte
	// Obtener y Establecer
	public String getCboBusqueda() {
		return cboBusqueda;
	}

	public void setCboBusqueda(String cboBusqueda) {
		this.cboBusqueda = cboBusqueda;
	}

	public String getTxtBusqueda() {
		return txtBusqueda;
	}

	public void setTxtBusqueda(String txtBusqueda) {
		this.txtBusqueda = txtBusqueda;
	}

	public String getTxtEliminar() {
		return txtEliminar;
	}

	public void setTxtEliminar(String txtEliminar) {
		this.txtEliminar = txtEliminar;
	}

	public ProyectoDTO getProyecto() {
		return proyecto;
	}

	public void setProyecto(ProyectoDTO proyecto) {
		this.proyecto = proyecto;
	}

	public List<ProyectoDTO> getProyectos() {
		return proyectos;
	}

	public void setProyectos(List<ProyectoDTO> proyectos) {
		this.proyectos = proyectos;
	}

	public List<PortafolioDTO> getPortafolios() {
		return portafolios;
	}

	public void setPortafolios(List<PortafolioDTO> portafolios) {
		this.portafolios = portafolios;
	}
	
}
