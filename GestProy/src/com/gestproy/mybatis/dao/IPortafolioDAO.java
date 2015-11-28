package com.gestproy.mybatis.dao;

import java.util.List;

import com.gestproy.beans.PortafolioDTO;

public interface IPortafolioDAO {
	
	public int registrarPortafolio(PortafolioDTO portafolio);
	public void actualizarPortafolio(PortafolioDTO portafolio);
	public void eliminarPortafolio(int codigo);
	public List<PortafolioDTO>listarPortafolios();
	public PortafolioDTO obtenerPortafolio(int codigo);
	
}
