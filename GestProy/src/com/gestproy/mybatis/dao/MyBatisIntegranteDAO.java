package com.gestproy.mybatis.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.gestproy.beans.IntegranteDTO;
import com.gestproy.mybatis.connection.MyBatisConnectionManager;

public class MyBatisIntegranteDAO implements IIntegranteDAO {
	
	private SqlSession obtenerSesion(){
		SqlSession sesion = MyBatisConnectionManager.getInstance().getSqlSessionFactory().openSession();
		return sesion;
	}

	@Override
	public int registrarIntegrante(IntegranteDTO integrante) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void actualizarIntegrante(IntegranteDTO integrante) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarIntegrante(int codigo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<IntegranteDTO> listarIntegrantes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IntegranteDTO obtenerIntegrante(int codigo) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
