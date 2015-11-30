package com.gestproy.mybatis.dao;

import java.util.List;

import com.gestproy.beans.UsuarioDTO;

/**
 * Esta clase contiene los metodos que utilizara el Mapper XML
 * de MyBatis
 * @author suite701
 *
 */
public interface UsuarioMapper {

	public int registrarUsuario(UsuarioDTO usuario);
	public void actualizarUsuario(UsuarioDTO usuario);
	public void eliminarUsuario(int codigo);
	public List<UsuarioDTO>listarUsuarios(UsuarioDTO usuario);
	public UsuarioDTO obtenerUsuario(int codigo);
	
}
