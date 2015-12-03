package com.gestproy.actions;

import java.util.List;

import com.gestproy.beans.DocumentoDTO;
import com.gestproy.beans.TareaDTO;
import com.gestproy.service.DocumentoService;
import com.gestproy.service.TareaService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class DocumentoAction extends ActionSupport implements Preparable {
	
private static final long serialVersionUID = 1470228705843594914L;
	
	//variables
	private DocumentoDTO documento = new DocumentoDTO();
	private List<DocumentoDTO> documentos;
	DocumentoService servicioDocumento = new DocumentoService();
	
	//Implementaciones
	@Override
	public void prepare() throws Exception {
		this.documentos = servicioDocumento.listarDocumentos(getDocumento());
	}
	
	//Metodos de Mantenimiento
	public String cargarRegistrar(){
		return SUCCESS;
	}
	public String cargarActualizar(){
		System.out.println("codigo: "+this.documento.getDocumentoId());
		for(DocumentoDTO c : documentos){
			if(c.getDocumentoId() == this.documento.getDocumentoId()){
				documento = c;
			}
		}
		return SUCCESS;
	}
	public String registrar(){
		servicioDocumento.registrarDocumento(getDocumento());
		this.documentos = servicioDocumento.listarDocumentos(getDocumento());
		return SUCCESS;
	}
	public String actualizar(){
		servicioDocumento.actualizarDocumento(getDocumento());
		this.documentos = servicioDocumento.listarDocumentos(getDocumento());
		return SUCCESS;
	}
	public String listar(){
		this.documentos = servicioDocumento.listarDocumentos(getDocumento());
		return SUCCESS;
	}
	public String eliminar(){
		servicioDocumento.eliminarDocumento(getDocumento().getDocumentoId());
		this.documentos = servicioDocumento.listarDocumentos(getDocumento());
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
	public void setDocumento(DocumentoDTO documento) {
		this.documento = documento;
	}
	public List<DocumentoDTO> getDocumentos() {
		return documentos;
	}
	public void setDocumentos(List<DocumentoDTO> documentos) {
		this.documentos = documentos;
	}
	
}
