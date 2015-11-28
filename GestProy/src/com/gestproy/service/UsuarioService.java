package com.gestproy.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.gestproy.beans.UsuarioDTO;
import com.gestproy.mybatis.connection.MyBatisConnectionManager;
import com.gestproy.mybatis.dao.IUsuarioDAO;

public class UsuarioService {
	
	
	private SqlSession obtenerSesion() {
		// Obtener una sesión para la conexión a la base de datos
		SqlSession sesion = MyBatisConnectionManager.getInstance()
				.getSqlSessionFactory().openSession();
		// Retorno la sesión a quien la necesite
		return sesion;
	}

	/**
	 * Este método retorna la lista con todas las filas de la tabla tb_empleado.
	 * (select * from tb_empleado;)
	 * @return Lista de empleados
	 */
	public List<UsuarioDTO> getUsuario() {
		// Acceder al mapper de la entidad para consumir las operaciones
		SqlSession sesion = this.obtenerSesion();
		List<UsuarioDTO> listaEmpleados = 
				sesion.getMapper(IUsuarioDAO.class).listarUsuarios();
		//No olvidar cerrar la sesión
		sesion.close();
		//Retornar la lista
		return listaEmpleados;
	}
	
	/**
	 * Este método permite registrar un empleado utilizando el comando DML "insert"
	 * @param empleado Que es el objeto con los datos del empleado
	 */
	public void registrarUsuario(UsuarioDTO usuario) {
		// Acceder al mapper
		SqlSession sesion = this.obtenerSesion();
		sesion.getMapper(IUsuarioDAO.class).registrarUsuario(usuario);
		// Me aseguro que el registro haya sido agregado
		sesion.commit();
		//Cierro la sesión
		sesion.close();
	}
	
	/**
	 * Este método permite utilizar la operación de "update"
	 * @param empleado Es el empleado que se quiere modificar
	 */
	public void actualizarUsuario(UsuarioDTO usuario) {
		//Acceder al mapper
		SqlSession sesion = this.obtenerSesion();
		sesion.getMapper(IUsuarioDAO.class).actualizarUsuario(usuario);
		//Me aseguro que el registro fue alterado
		sesion.commit();
		//Cierro la sesión
		sesion.close();
	}
	
	/**
	 * Este método permite eliminar un empleado de la tabla a través del "delete"
	 * @param codigo El código del empleado que quiero eliminar
	 */
	public void eliminarUsuario(int codigo) {
		//Acceder al mapper
		SqlSession sesion = this.obtenerSesion();
		sesion.getMapper(IUsuarioDAO.class).eliminarUsuario(codigo);
		//Me aseguro que el registro fue eliminado
		sesion.commit();
		//Cierro la sesión
		sesion.close();
	}
	
	/**
	 * Este método permite obtener un sólo empleado en base al código
	 * @param codigo Es el código del empleado
	 * @return Un empleado de la base de datos
	 */
	public UsuarioDTO obtenerUsuario(int codigo) {
		//Acceder al mapper
		SqlSession sesion = this.obtenerSesion();
		UsuarioDTO usuarioConsultado = 
				sesion.getMapper(IUsuarioDAO.class).obtenerUsuario(codigo);
		//Cierro la sesión
		sesion.close();
		return usuarioConsultado;
	

}

}
