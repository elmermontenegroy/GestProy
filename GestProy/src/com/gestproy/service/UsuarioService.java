package com.gestproy.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.gestproy.beans.UsuarioDTO;
import com.gestproy.mybatis.connection.MyBatisConnectionManager;
import com.gestproy.mybatis.dao.UsuarioMapper;

public class UsuarioService {
	
	
	private SqlSession obtenerSesion() {
		// Obtener una sesión para la conexión a la base de datos
		SqlSession sesion = MyBatisConnectionManager.getInstance()
				.getSqlSessionFactory().openSession();
		// Retorno la sesión a quien la necesite
		return sesion;
	}
	
	public void registrarUsuario(UsuarioDTO usuario) {
		// Acceder al mapper
		SqlSession sesion = this.obtenerSesion();
		sesion.getMapper(UsuarioMapper.class).registrarUsuario(usuario);
		// Me aseguro que el registro haya sido agregado
		sesion.commit();
		//Cierro la sesi�n
		sesion.close();
	}
	
	public void actualizarUsuario(UsuarioDTO usuario) {
		//Acceder al mapper
		SqlSession sesion = this.obtenerSesion();
		sesion.getMapper(UsuarioMapper.class).actualizarUsuario(usuario);
		//Me aseguro que el registro fue alterado
		sesion.commit();
		//Cierro la sesión
		sesion.close();
	}
	
	public void eliminarUsuarios(String codigos) {
		//Acceder al mapper
		SqlSession sesion = this.obtenerSesion();
		sesion.getMapper(UsuarioMapper.class).eliminarUsuarios(codigos);
		//Me aseguro que el registro fue eliminado
		sesion.commit();
		//Cierro la sesión
		sesion.close();
	}

	public List<UsuarioDTO> listarUsuarios(UsuarioDTO usuario) {
		// Acceder al mapper de la entidad para consumir las operaciones
		SqlSession sesion = this.obtenerSesion();
		List<UsuarioDTO> listaUsuarios = 
				sesion.getMapper(UsuarioMapper.class).listarUsuarios(usuario);
		//No olvidar cerrar la sesión
		sesion.close();
		//Retornar la lista
		return listaUsuarios;
	}
	
	public UsuarioDTO obtenerUsuario(int codigo) {
		//Acceder al mapper
		SqlSession sesion = this.obtenerSesion();
		UsuarioDTO usuarioConsultado = 
				sesion.getMapper(UsuarioMapper.class).obtenerUsuario(codigo);
		//Cierro la sesión
		sesion.close();
		return usuarioConsultado;
	

}

}
