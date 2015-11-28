package com.gestproy.mybatis.dao;

import java.util.List;

import com.gestproy.beans.IntegranteDTO;

public interface IIntegranteDAO {

	public int registrarIntegrante(IntegranteDTO integrante);
	public void actualizarIntegrante(IntegranteDTO integrante);
	public void eliminarIntegrante(int codigo);
	public List<IntegranteDTO>listarIntegrantes();
	public IntegranteDTO obtenerIntegrante(int codigo);
	
}
