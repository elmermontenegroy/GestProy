package com.gestproy.actions;

import java.util.List;

import com.gestproy.beans.DocumentoDTO;
import com.gestproy.beans.TareaDTO;
import com.gestproy.service.DocumentoService;
import com.gestproy.service.TareaService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class DocumentoAction extends ActionSupport implements Preparable {
	
	private DocumentoDTO documento = new DocumentoDTO();
	private List<DocumentoDTO> documentos;
	DocumentoService servicioDocumento = new DocumentoService();
	
	@Override
	public void prepare() throws Exception {
		

		setDocumentos(obtenerListaDeDocumentos());
		
		 System.out.println("Prepare Updating ...");  

	}
	
	
	//Metodos
		public String registrarDocumento(){
			
			servicioDocumento.registrarDocumento(getDocumento());
			
			
			return SUCCESS;
		}
		
		public String inicializarActualizar(){
			System.out.println("codigo: "+this.documento.getDocumentoId());
			for(DocumentoDTO c : documentos){
				if(c.getDocumentoId() == this.documento.getDocumentoId()){
					documento = c;
				}
			}
			return SUCCESS;
		}
		
		public String actualizarDocumento(){
			
			
			servicioDocumento.actualizarDocumento(getDocumento());
			
			return SUCCESS;
		}
		
		public String eliminarDocumento(){
			
			
			servicioDocumento.eliminarDocumento(getDocumento().getDocumentoId());
			
				return SUCCESS;
			
			
		}
		
		public String listarDocumentos(){
			this.documentos = obtenerListaDeDocumentos();
			return SUCCESS;
		}
		
		private List<DocumentoDTO> obtenerListaDeDocumentos(){

			List<DocumentoDTO> listDocumento;

			listDocumento=servicioDocumento.listarDocumentos(getDocumento());
			
			return listDocumento;
		

			
	
		
		}
		
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
