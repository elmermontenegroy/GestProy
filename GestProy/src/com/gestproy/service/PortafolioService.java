package com.gestproy.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.gestproy.beans.PortafolioDTO;
import com.gestproy.beans.TareaDTO;
import com.gestproy.mybatis.connection.MyBatisConnectionManager;
import com.gestproy.mybatis.dao.PortafolioMapper;
import com.gestproy.mybatis.dao.TareaMapper;

public class PortafolioService {
	
	
	private SqlSession obtenerSesion() {
		// Obtener una sesión para la conexión a la base de datos
		SqlSession sesion = MyBatisConnectionManager.getInstance()
				.getSqlSessionFactory().openSession();
		// Retorno la sesión a quien la necesite
		return sesion;
	}

	public void registrarPortafolio(PortafolioDTO portafolio) {
		// Acceder al mapper
		SqlSession sesion = this.obtenerSesion();
		sesion.getMapper(PortafolioMapper.class).registrarPortafolio(portafolio);
		// Me aseguro que el registro haya sido agregado
		sesion.commit();
		//Cierro la sesión
		sesion.close();
	}
	
	public void actualizarPortafolio(PortafolioDTO portafolio) {
		//Acceder al mapper
		SqlSession sesion = this.obtenerSesion();
		sesion.getMapper(PortafolioMapper.class).actualizarPortafolio(portafolio);
		//Me aseguro que el registro fue alterado
		sesion.commit();
		//Cierro la sesión
		sesion.close();
	}
	
	public void eliminarPortafolio(int codigo) {
		//Acceder al mapper
		SqlSession sesion = this.obtenerSesion();
		sesion.getMapper(PortafolioMapper.class).eliminarPortafolio(codigo);;
		//Me aseguro que el registro fue eliminado
		sesion.commit();
		//Cierro la sesión
		sesion.close();
	}
	
	public List<PortafolioDTO> listarPortafolios(PortafolioDTO portafolio) {
		// Acceder al mapper de la entidad para consumir las operaciones
		SqlSession sesion = this.obtenerSesion();
		List<PortafolioDTO> listarPortafolios = 
				sesion.getMapper(PortafolioMapper.class).listarPortafolios(portafolio);
		//No olvidar cerrar la sesión
		sesion.close();
		//Retornar la lista
		return listarPortafolios;
	}
	

}
