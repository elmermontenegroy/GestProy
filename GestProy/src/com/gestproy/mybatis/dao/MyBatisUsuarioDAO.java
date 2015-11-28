package com.gestproy.mybatis.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.gestproy.beans.UsuarioDTO;
import com.gestproy.mybatis.connection.MyBatisConnectionManager;

public class MyBatisUsuarioDAO implements IUsuarioDAO {
	
	private SqlSession obtenerSesion(){
		SqlSession sesion = MyBatisConnectionManager.getInstance().getSqlSessionFactory().openSession();
		return sesion;
	}

	@Override
	public int registrarUsuario(UsuarioDTO usuario) {
		int codigoGenerado = -1;
		SqlSession sesion = obtenerSesion();
		codigoGenerado = sesion.getMapper(MUsuarioMapper.class).registrarUsuario(usuario);
		sesion.commit();
		sesion.close();
		return codigoGenerado;
	}

	@Override
	public void actualizarUsuario(UsuarioDTO usuario) {
		SqlSession sesion = obtenerSesion();
		sesion.getMapper(MUsuarioMapper.class).actualizarUsuario(usuario);
		sesion.commit();
		sesion.close();
	}

	@Override
	public void eliminarUsuario(int codigo) {
		SqlSession sesion = obtenerSesion();
		sesion.getMapper(MUsuarioMapper.class).eliminarUsuario(codigo);
		sesion.commit();
		sesion.close();
	}

	@Override
	public List<UsuarioDTO> listarUsuarios() {
		SqlSession sesion = obtenerSesion();
		List<UsuarioDTO> clientes = sesion.getMapper(MUsuarioMapper.class).listarUsuarios();
		sesion.close();
		return clientes;
	}

	@Override
	public UsuarioDTO obtenerUsuario(int codigo) {
		SqlSession sesion = obtenerSesion();
		UsuarioDTO usuario = sesion.getMapper(MUsuarioMapper.class).obtenerUsuario(codigo);
		sesion.close();
		return usuario;
	}

}
