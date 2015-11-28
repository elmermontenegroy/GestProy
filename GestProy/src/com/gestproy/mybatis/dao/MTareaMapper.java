package com.gestproy.mybatis.dao;

import java.util.List;

import com.gestproy.beans.TareaDTO;

/**
 * Esta clase contiene los metodos que utilizara el Mapper XML
 * de MyBatis
 * @author suite701
 *
 */
public interface MTareaMapper {

	public int registrarTarea(TareaDTO tarea);
	public void actualizarTarea(TareaDTO tarea);
	public void eliminarTarea(int codigo);
	public List<TareaDTO>listarTareas();
	public TareaDTO obtenerTarea(int codigo);
	
}
