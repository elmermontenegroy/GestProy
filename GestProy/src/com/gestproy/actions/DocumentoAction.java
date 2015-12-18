package com.gestproy.actions;

import java.util.List;

import org.apache.struts2.dispatcher.SessionMap;

import com.gestproy.beans.DocumentoDTO;
import com.gestproy.beans.PortafolioDTO;
import com.gestproy.beans.ProyectoDTO;
import com.gestproy.beans.TareaDTO;
import com.gestproy.service.DocumentoService;
import com.gestproy.service.ProyectoService;
import com.gestproy.service.TareaService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class DocumentoAction extends ActionSupport implements Preparable {
	
private static final long serialVersionUID = 1470228705843594914L;
	
		//variables
	private String cboBusqueda;
	private String txtBusqueda;
	private String txtEliminar;
	
	private ProyectoDTO proyecto;
	private DocumentoDTO documento;
	
	private SessionMap<String, Object> session;
	
	private List<DocumentoDTO> documentos;
	private List<ProyectoDTO> proyectos;
	
	ProyectoService servicioProyecto = new ProyectoService();
	DocumentoService servicioDocumento = new DocumentoService();
	
	//Implementaciones
	@Override
	public void prepare() throws Exception {
		proyectos = servicioProyecto.listarProyectos(new ProyectoDTO());
		documentos = servicioDocumento.listarDocumentos(new DocumentoDTO());
	}
	
	//Metodos de Mantenimiento
	public String cargarRegistrar(){
		documento = new DocumentoDTO();
		documento.setProyecto(new ProyectoDTO());
		documento.getProyecto().setProyectoId(1);
		//proyecto.setEstado('A');
		return SUCCESS;
	}
	public String cargarActualizar(){
		documento = servicioDocumento.obtenerDocumento(documento.getDocumentoId());
		return SUCCESS;
	}
	
	public String buscar() {
		DocumentoDTO documento = new DocumentoDTO();
		switch (cboBusqueda) {
		case "0":
			documento.setNombre(txtBusqueda);
			break;
	
		}
		documentos = servicioDocumento.listarDocumentos(documento);
		return SUCCESS;
	}
	
	public String registrar(){
		servicioDocumento.registrarDocumento(documento);
		if (documento.getDocumentoId() > 0) {
			documentos = servicioDocumento.listarDocumentos(new DocumentoDTO());
			return SUCCESS;
		}
		return ERROR;
	}
	public String actualizar(){
		servicioDocumento.actualizarDocumento(documento);
		documentos = servicioDocumento.listarDocumentos(new DocumentoDTO());
		return SUCCESS;
	}
	/*public String listar(){
		this.documentos = servicioDocumento.listarDocumentos(getDocumento());
		return SUCCESS;
	}*/
	public String eliminar(){
		servicioDocumento.eliminarDocumento(txtEliminar);
		documentos = servicioDocumento.listarDocumentos(new DocumentoDTO());
		return SUCCESS;
	}
	private boolean validar(){
		return true;
	}
	
	//Metodos de Reporte
	
	//Obtener y Establecer
	
	
	
	public DocumentoDTO getDocumento() {
		return documento;
	}
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

	public void setDocumento(DocumentoDTO documento) {
		this.documento = documento;
	}
	public List<DocumentoDTO> getDocumentos() {
		return documentos;
	}
	public void setDocumentos(List<DocumentoDTO> documentos) {
		this.documentos = documentos;
	}

	public List<ProyectoDTO> getProyectos() {
		return proyectos;
	}

	public void setProyectos(List<ProyectoDTO> proyectos) {
		this.proyectos = proyectos;
	}
	
	
	
}
