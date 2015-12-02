package com.gestproy.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.gestproy.beans.DocumentoDTO;
import com.gestproy.beans.TareaDTO;
import com.gestproy.mybatis.connection.MyBatisConnectionManager;
import com.gestproy.mybatis.dao.DocumentoMapper;
import com.gestproy.mybatis.dao.TareaMapper;

public class DocumentoService { 
	
	
	private SqlSession obtenerSesion() {
		// Obtener una sesión para la conexión a la base de datos
		SqlSession sesion = MyBatisConnectionManager.getInstance()
				.getSqlSessionFactory().openSession();
		// Retorno la sesión a quien la necesite
		return sesion;
	}
	
	public void registrarDocumento(DocumentoDTO documento) {
		// Acceder al mapper
		SqlSession sesion = this.obtenerSesion();
		sesion.getMapper(DocumentoMapper.class).registrarDocumento(documento);
		// Me aseguro que el registro haya sido agregado
		sesion.commit();
		//Cierro la sesión
		sesion.close();
	}
	
	public void actualizarDocumento(DocumentoDTO documento) {
		//Acceder al mapper
		SqlSession sesion = this.obtenerSesion();
		sesion.getMapper(DocumentoMapper.class).actualizarDocumento(documento);;
		//Me aseguro que el registro fue alterado
		sesion.commit();
		//Cierro la sesión
		sesion.close();
	}
	
	public void eliminarDocumento(int codigo) {
		//Acceder al mapper
		SqlSession sesion = this.obtenerSesion();
		sesion.getMapper(DocumentoMapper.class).eliminarDocumento(codigo);
		//Me aseguro que el registro fue eliminado
		sesion.commit();
		//Cierro la sesión
		sesion.close();
	}

	public List<DocumentoDTO> listarDocumentos(DocumentoDTO documento) {
		// Acceder al mapper de la entidad para consumir las operaciones
		SqlSession sesion = this.obtenerSesion();
		List<DocumentoDTO> listaDocumentos = 
				sesion.getMapper(DocumentoMapper.class).listarDocumentos(documento);
		//No olvidar cerrar la sesión
		sesion.close();
		//Retornar la lista
		return listaDocumentos;
	}
	
	public DocumentoDTO obtenerDocumento(int codigo) {
		//Acceder al mapper
		SqlSession sesion = this.obtenerSesion();
		DocumentoDTO documentoConsultado = 
				sesion.getMapper(DocumentoMapper.class).obtenerDocumento(codigo);
		//Cierro la sesión
		sesion.close();
		return documentoConsultado;
	

}

}
