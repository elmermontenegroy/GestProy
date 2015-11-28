package com.gestproy.mybatis.dao;

import java.util.List;

import com.gestproy.beans.UsuarioDTO;

public interface IUsuarioDAO {

	public int registrarUsuario(UsuarioDTO usuario);
	public void actualizarUsuario(UsuarioDTO usuario);
	public void eliminarUsuario(int codigo);
	public List<UsuarioDTO>listarUsuarios();
	public UsuarioDTO obtenerUsuario(int codigo);

}
