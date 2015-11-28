package com.gestproy.mybatis.dao;

import java.util.List;

import com.gestproy.beans.TareaDTO;

public interface ITareaDAO {

	public int registrarTarea(TareaDTO tarea);
	public void actualizarTarea(TareaDTO tarea);
	public void eliminarTarea(int codigo);
	public List<TareaDTO>listarTareas();
	public TareaDTO obtenerTarea(int codigo);
	
}
