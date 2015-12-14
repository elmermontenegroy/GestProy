package com.gestproy.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.gestproy.beans.TareaDTO;
import com.gestproy.beans.TipoUsuarioDTO;
import com.gestproy.beans.UsuarioDTO;
import com.gestproy.mybatis.connection.MyBatisConnectionManager;
import com.gestproy.mybatis.dao.TareaMapper;
import com.gestproy.mybatis.dao.TipoUsuarioMapper;
import com.gestproy.mybatis.dao.UsuarioMapper;

public class TipoUsuarioService { 

	private SqlSession obtenerSesion() {
		// Obtener una sesión para la conexión a la base de datos
		SqlSession sesion = MyBatisConnectionManager.getInstance()
				.getSqlSessionFactory().openSession();
		// Retorno la sesión a quien la necesite
		return sesion;
	}
	
	public List<TipoUsuarioDTO> listarTipoUsuarios(TipoUsuarioDTO tipoUsuario) {
		
		// Acceder al mapper de la entidad para consumir las operaciones
		SqlSession sesion = this.obtenerSesion();
		List<TipoUsuarioDTO> listarTipoUsuarios = 
				sesion.getMapper(TipoUsuarioMapper.class).listarTipoUsuarios(tipoUsuario);
		//No olvidar cerrar la sesión
		sesion.close();
		//Retornar la lista
		return listarTipoUsuarios;
	}

}
