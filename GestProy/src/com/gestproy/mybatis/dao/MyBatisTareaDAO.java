package com.gestproy.mybatis.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.gestproy.beans.TareaDTO;
import com.gestproy.mybatis.connection.MyBatisConnectionManager;

public class MyBatisTareaDAO implements ITareaDAO {
	
	private SqlSession obtenerSesion(){
		SqlSession sesion = MyBatisConnectionManager.getInstance().getSqlSessionFactory().openSession();
		return sesion;
	}

	@Override
	public int registrarTarea(TareaDTO tarea) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void actualizarTarea(TareaDTO tarea) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarTarea(int codigo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TareaDTO> listarTareas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TareaDTO obtenerTarea(int codigo) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
