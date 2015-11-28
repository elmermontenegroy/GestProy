package com.gestproy.mybatis.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.gestproy.beans.DocumentoDTO;
import com.gestproy.mybatis.connection.MyBatisConnectionManager;

public class MyBatisDocumentoDAO implements IDocumentoDAO {
	
	private SqlSession obtenerSesion(){
		SqlSession sesion = MyBatisConnectionManager.getInstance().getSqlSessionFactory().openSession();
		return sesion;
	}

	@Override
	public int registrarDocumento(DocumentoDTO documento) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void actualizarDocumento(DocumentoDTO documento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarDocumento(int codigo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<DocumentoDTO> listarDocumentos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DocumentoDTO obtenerDocumento(int codigo) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
