package com.gestproy.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.gestproy.beans.ProyectoDTO;
import com.gestproy.mybatis.connection.MyBatisConnectionManager;
import com.gestproy.mybatis.dao.ProyectoMapper;

public class ProyectoService {
	
	
	private SqlSession obtenerSesion() {
		// Obtener una sesión para la conexión a la base de datos
		SqlSession sesion = MyBatisConnectionManager.getInstance()
				.getSqlSessionFactory().openSession();
		// Retorno la sesión a quien la necesite
		return sesion;
	}
	
	public void registrarProyecto(ProyectoDTO proyecto) {
		// Acceder al mapper
		SqlSession sesion = this.obtenerSesion();
		sesion.getMapper(ProyectoMapper.class).registrarProyecto(proyecto);
		// Me aseguro que el registro haya sido agregado
		sesion.commit();
		//Cierro la sesi�n
		sesion.close();
	}
	
	public void actualizarProyecto(ProyectoDTO proyecto) {
		//Acceder al mapper
		SqlSession sesion = this.obtenerSesion();
		sesion.getMapper(ProyectoMapper.class).actualizarProyecto(proyecto);
		//Me aseguro que el registro fue alterado
		sesion.commit();
		//Cierro la sesión
		sesion.close();
	}
	
	public void eliminarProyectos(String codigos) {
		//Acceder al mapper
		SqlSession sesion = this.obtenerSesion();
		sesion.getMapper(ProyectoMapper.class).eliminarProyectos(codigos);
		//Me aseguro que el registro fue eliminado
		sesion.commit();
		//Cierro la sesión
		sesion.close();
	}

	public List<ProyectoDTO> listarProyectos(ProyectoDTO proyecto) {
		// Acceder al mapper de la entidad para consumir las operaciones
		SqlSession sesion = this.obtenerSesion();
		List<ProyectoDTO> listaProyectos = 
				sesion.getMapper(ProyectoMapper.class).listarProyectos(proyecto);
		//No olvidar cerrar la sesión
		sesion.close();
		//Retornar la lista
		return listaProyectos;
	}
	
	public ProyectoDTO obtenerProyecto(int codigo) {
		//Acceder al mapper
		SqlSession sesion = this.obtenerSesion();
		ProyectoDTO proyecto = 
				sesion.getMapper(ProyectoMapper.class).obtenerProyecto(codigo);
		//Cierro la sesión
		sesion.close();
		return proyecto;
	}

}
