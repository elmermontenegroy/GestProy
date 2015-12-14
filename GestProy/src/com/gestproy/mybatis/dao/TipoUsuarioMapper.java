package com.gestproy.mybatis.dao;

import java.util.List;

import com.gestproy.beans.TareaDTO;
import com.gestproy.beans.TipoUsuarioDTO;

/**
 * Esta clase contiene los metodos que utilizara el Mapper XML
 * de MyBatis
 * @author suite701
 *
 */
public interface TipoUsuarioMapper {

	public List<TipoUsuarioDTO>listarTipoUsuarios(TipoUsuarioDTO tipoUsuario);
	
}
