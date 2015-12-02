package com.gestproy.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.gestproy.beans.TareaDTO;
import com.gestproy.beans.UsuarioDTO;
import com.gestproy.mybatis.connection.MyBatisConnectionManager;
import com.gestproy.mybatis.dao.TareaMapper;
import com.gestproy.mybatis.dao.UsuarioMapper;

public class TareaService { 
	
	
	private SqlSession obtenerSesion() {
		// Obtener una sesión para la conexión a la base de datos
		SqlSession sesion = MyBatisConnectionManager.getInstance()
				.getSqlSessionFactory().openSession();
		// Retorno la sesión a quien la necesite
		return sesion;
	}
	
	public void registrarTarea(TareaDTO tarea) {
		// Acceder al mapper
		SqlSession sesion = this.obtenerSesion();
		sesion.getMapper(TareaMapper.class).registrarTarea(tarea);
		// Me aseguro que el registro haya sido agregado
		sesion.commit();
		//Cierro la sesión
		sesion.close();
	}
	
	public void actualizarTarea(TareaDTO tarea) {
		//Acceder al mapper
		SqlSession sesion = this.obtenerSesion();
		sesion.getMapper(TareaMapper.class).actualizarTarea(tarea);
		//Me aseguro que el registro fue alterado
		sesion.commit();
		//Cierro la sesión
		sesion.close();
	}
	
	public void eliminarTarea(int codigo) {
		//Acceder al mapper
		SqlSession sesion = this.obtenerSesion();
		sesion.getMapper(TareaMapper.class).eliminarTarea(codigo);;
		//Me aseguro que el registro fue eliminado
		sesion.commit();
		//Cierro la sesión
		sesion.close();
	}

	public List<TareaDTO> listarTareas(TareaDTO tarea) {
		// Acceder al mapper de la entidad para consumir las operaciones
		SqlSession sesion = this.obtenerSesion();
		List<TareaDTO> listaTareas = 
				sesion.getMapper(TareaMapper.class).listarTareas(tarea);
		//No olvidar cerrar la sesión
		sesion.close();
		//Retornar la lista
		return listaTareas;
	}
	
	public TareaDTO obtenerTarea(int codigo) {
		//Acceder al mapper
		SqlSession sesion = this.obtenerSesion();
		TareaDTO tareaConsultada = 
				sesion.getMapper(TareaMapper.class).obtenerTarea(codigo);
		//Cierro la sesión
		sesion.close();
		return tareaConsultada;
	

}

}
