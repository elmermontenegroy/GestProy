package com.gestproy.mybatis.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.gestproy.beans.ProyectoDTO;
import com.gestproy.mybatis.connection.MyBatisConnectionManager;

public class MyBatisProyectoDAO implements IProyectoDAO {
	
	private SqlSession obtenerSesion(){
		SqlSession sesion = MyBatisConnectionManager.getInstance().getSqlSessionFactory().openSession();
		return sesion;
	}

	@Override
	public int registrarProyecto(ProyectoDTO proyecto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void actualizarProyecto(ProyectoDTO proyecto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarProyecto(int codigo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ProyectoDTO> listarProyectos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProyectoDTO obtenerProyecto(int codigo) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
