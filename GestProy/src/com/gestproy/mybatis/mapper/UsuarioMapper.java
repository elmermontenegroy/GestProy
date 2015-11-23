package com.gestproy.mybatis.mapper;

import java.util.List;

import com.gestproy.dataobjects.UsuarioDTO;

public interface UsuarioMapper {

	public List<UsuarioDTO> getUsuarios();
	
	
	public void registrarUsuario(UsuarioDTO usuario);
	
	
	public void actualizarUsuario(UsuarioDTO usuario);
	
	public void eliminarUsuario(int codigo);
	
	
	public UsuarioDTO obtenerUsuarioPorCodigo(int codigo);

}
