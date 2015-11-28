package com.gestproy.mybatis.dao;

import java.util.List;

import com.gestproy.beans.ProyectoDTO;

public interface IProyectoDAO {

	public int registrarProyecto(ProyectoDTO proyecto);
	public void actualizarProyecto(ProyectoDTO proyecto);
	public void eliminarProyecto(int codigo);
	public List<ProyectoDTO>listarProyectos();
	public ProyectoDTO obtenerProyecto(int codigo);
	
}
