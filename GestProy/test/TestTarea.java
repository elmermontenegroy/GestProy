import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.gestproy.beans.ProyectoDTO;
import com.gestproy.beans.TareaDTO;
import com.gestproy.beans.UsuarioDTO;
import com.gestproy.service.TareaService;
import com.gestproy.service.UsuarioService;


public class TestTarea {

	TareaService servicioTarea;
	
	@Before  
	public void antesDelTest() {  
		//1. Invoco al servicio para obtener datos del empleado
		servicioTarea = new TareaService();
	}
	
	

	@Test
	public void testListarTarea() {
		List<TareaDTO> listTarea;
		TareaDTO tarea = new TareaDTO();
		listTarea=servicioTarea.listarTareas(tarea);
		
	
	   for(TareaDTO t: listTarea){
		   
		   
		   System.out.println(t.getTareaId());
		   
	   }
	}
	
	

}
