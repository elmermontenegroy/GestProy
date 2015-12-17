import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.gestproy.beans.PortafolioDTO;
import com.gestproy.service.PortafolioService;

public class PortafolioTest {
	
	PortafolioService servicioPortafolio;
	
	@Before  
	public void antesDelTest() {  
		//1. Invoco al servicio para obtener datos del empleado
		servicioPortafolio = new PortafolioService();
	}
	

	@Test
	public void testListarPortafolios() {
		List<PortafolioDTO> listPortafolios;
		PortafolioDTO portafolio = new PortafolioDTO();
		portafolio.setDescripcion("");
		listPortafolios = servicioPortafolio.listarPortafolios(portafolio);
		if(listPortafolios!=null && !listPortafolios.isEmpty()){
			for(PortafolioDTO p : listPortafolios){
				System.out.println(p.toString());
			}
		}else{
			System.out.println("MAL");
		}
	}


}
