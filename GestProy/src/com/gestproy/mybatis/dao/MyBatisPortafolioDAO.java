package com.gestproy.mybatis.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.gestproy.beans.PortafolioDTO;
import com.gestproy.mybatis.connection.MyBatisConnectionManager;

public class MyBatisPortafolioDAO implements IPortafolioDAO {
	
	private SqlSession obtenerSesion(){
		SqlSession sesion = MyBatisConnectionManager.getInstance().getSqlSessionFactory().openSession();
		return sesion;
	}

	@Override
	public int registrarPortafolio(PortafolioDTO portafolio) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void actualizarPortafolio(PortafolioDTO portafolio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarPortafolio(int codigo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PortafolioDTO> listarPortafolios() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PortafolioDTO obtenerPortafolio(int codigo) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
