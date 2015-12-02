package com.gestproy.actions;

import java.util.List;

import com.gestproy.beans.TareaDTO;
import com.gestproy.config.enums.TipoPersistencia;
import com.gestproy.service.TareaService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class TareaAction extends ActionSupport implements Preparable {
 
	private TareaDTO tarea = new TareaDTO();
	private List<TareaDTO> tareas;
	TareaService servicioTarea = new TareaService();
	
	@Override
	public void prepare() throws Exception {
		
 
		setTareas(obtenerListaDeTareas());
		
		 System.out.println("Prepare Updating ...");  

	 }
	
	
	//Metodos
		public String registrarTarea(){
			
			servicioTarea.registrarTarea(getTarea());
			
			
			return SUCCESS;
		}
		
		public String inicializarActualizar(){
			System.out.println("codigo: "+this.tarea.getTareaId());
			for(TareaDTO c : tareas){
				if(c.getTareaId() == this.tarea.getTareaId()){
					  tarea = c;
				}
			}
			return SUCCESS;
		}
		
		public String actualizarTarea(){
			
			
			servicioTarea.actualizarTarea(getTarea());
			
			return SUCCESS;
		}
		
		public String eliminarTarea(){
			
			
			servicioTarea.eliminarTarea(getTarea().getTareaId());
			
				return SUCCESS;
			
			
		}
		
		public String listarTareas(){
			this.tareas = obtenerListaDeTareas();
			return SUCCESS;
		}
		
		private List<TareaDTO> obtenerListaDeTareas(){

			List<TareaDTO> listTarea;

			listTarea=servicioTarea.listarTareas(getTarea());
			
			return listTarea;
		

			
	
		
		}
		
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
