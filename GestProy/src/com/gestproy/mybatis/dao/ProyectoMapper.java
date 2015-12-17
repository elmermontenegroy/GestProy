package com.gestproy.mybatis.dao;

import java.util.List;

import com.gestproy.beans.ProyectoDTO;

/**
 * Esta clase contiene los metodos que utilizara el Mapper XML
 * de MyBatis
 * @author suite701
 *
 */
public interface ProyectoMapper {

	public int registrarProyecto(ProyectoDTO proyecto);
	public void actualizarProyecto(ProyectoDTO proyecto);
	public void eliminarProyectos(String codigos);
	public List<ProyectoDTO>listarProyectos(ProyectoDTO proyecto);
	public ProyectoDTO obtenerProyecto(int codigo);
	
}
