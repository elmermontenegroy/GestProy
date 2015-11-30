package com.gestproy.mybatis.dao;

import java.util.List;

import com.gestproy.beans.PortafolioDTO;

/**
 * Esta clase contiene los metodos que utilizara el Mapper XML
 * de MyBatis
 * @author suite701
 *
 */
public interface PortafolioMapper {

	public int registrarPortafolio(PortafolioDTO portafolio);
	public void actualizarPortafolio(PortafolioDTO portafolio);
	public void eliminarPortafolio(int codigo);
	public List<PortafolioDTO>listarPortafolios();
	public PortafolioDTO obtenerPortafolio(int codigo);
	
}
