package com.gestproy.mybatis.dao;

import java.util.List;

import com.gestproy.beans.IntegranteDTO;

/**
 * Esta clase contiene los metodos que utilizara el Mapper XML
 * de MyBatis
 * @author suite701
 *
 */
public interface IntegranteMapper {

	public int registrarIntegrante(IntegranteDTO integrante);
	public void actualizarIntegrante(IntegranteDTO integrante);
	public void eliminarIntegrante(int codigo);
	public List<IntegranteDTO>listarIntegrantes();
	public IntegranteDTO obtenerIntegrante(int codigo);
	
}
