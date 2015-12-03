package com.gestproy.actions;

import java.util.List;

import com.gestproy.beans.TareaDTO;
import com.gestproy.config.enums.TipoPersistencia;
import com.gestproy.service.TareaService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class TareaAction extends ActionSupport implements Preparable {
	
private static final long serialVersionUID = 1470228705843594914L;
	
	//variables
	private TareaDTO tarea = new TareaDTO();
	private List<TareaDTO> tareas;
	TareaService servicioTarea = new TareaService();
	
	//Implementaciones
	@Override
	public void prepare() throws Exception {
		this.tareas=servicioTarea.listarTareas(getTarea());
	}
	
	//Metodos de Mantenimiento
	public String cargarRegistrar(){
		return SUCCESS;
	}
	public String cargarActualizar(){
		System.out.println("codigo: "+this.tarea.getTareaId());
		for(TareaDTO c : tareas){
			if(c.getTareaId() == this.tarea.getTareaId()){
				  tarea = c;
			}
		}
		return SUCCESS;
	}
	public String registrar(){
		servicioTarea.registrarTarea(getTarea());
		this.tareas=servicioTarea.listarTareas(getTarea());
		return SUCCESS;
	}
	public String actualizar(){
		servicioTarea.actualizarTarea(getTarea());
		this.tareas=servicioTarea.listarTareas(getTarea());
		return SUCCESS;
	}
	public String listar(){
		this.tareas=servicioTarea.listarTareas(getTarea());
		return SUCCESS;
	}
	public String eliminar(){
		servicioTarea.eliminarTarea(getTarea().getTareaId());
		this.tareas=servicioTarea.listarTareas(getTarea());
		return SUCCESS;
	}
	private boolean validar(){
		return true;
	}
	
	//Metodos de Reporte
	
	//Obtener y Establecer
	public TareaDTO getTarea() {
		return tarea;
	}
	public void setTarea(TareaDTO tarea) {
		this.tarea = tarea;
	}
	public List<TareaDTO> getTareas() {
		return tareas;
	}
	public void setTareas(List<TareaDTO> tareas) {
		this.tareas = tareas;
	}
	
}
