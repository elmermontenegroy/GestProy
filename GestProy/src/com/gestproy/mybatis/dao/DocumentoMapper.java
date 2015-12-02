package com.gestproy.mybatis.dao;

import java.util.List;

import com.gestproy.beans.DocumentoDTO;

/**
 * Esta clase contiene los metodos que utilizara el Mapper XML
 * de MyBatis
 * @author suite701
 *
 */
public interface DocumentoMapper {

	public int registrarDocumento(DocumentoDTO documento);
	public void actualizarDocumento(DocumentoDTO documento);
	public void eliminarDocumento(int codigo);
	public List<DocumentoDTO>listarDocumentos(DocumentoDTO documento);
	public DocumentoDTO obtenerDocumento(int codigo);
	
}
