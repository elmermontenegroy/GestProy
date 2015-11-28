package com.gestproy.mybatis.dao;

import java.util.List;

import com.gestproy.beans.DocumentoDTO;

public interface IDocumentoDAO {

	public int registrarDocumento(DocumentoDTO documento);
	public void actualizarDocumento(DocumentoDTO documento);
	public void eliminarDocumento(int codigo);
	public List<DocumentoDTO>listarDocumentos();
	public DocumentoDTO obtenerDocumento(int codigo);
	
}
