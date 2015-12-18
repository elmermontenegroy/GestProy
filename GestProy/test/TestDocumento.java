import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.gestproy.beans.DocumentoDTO;
import com.gestproy.beans.ProyectoDTO;
import com.gestproy.service.DocumentoService;


public class TestDocumento {

	
   DocumentoService servDocumento = new DocumentoService();
   
   
    //@Test
	public void Registrar(){
		
		DocumentoDTO documento = new DocumentoDTO();
		documento.setProyecto(new ProyectoDTO());
		//documento.setDocumentoId();
		documento.setNombre("documento4");
		documento.getProyecto().setProyectoId(1);
		documento.setFechaInicio("2015-11-11");
		
	    servDocumento.registrarDocumento(documento);
	    System.out.println("codigo:" + documento.getDocumentoId());
	}
	 
    //@Test
    public void Actualizar(){
    	
    	DocumentoDTO documento = new DocumentoDTO();
    	documento.setProyecto(new ProyectoDTO());
    	documento.setDocumentoId(3);
    	documento.getProyecto().setProyectoId(1);
    	documento.setNombre("Tareita4");
    	documento.setFechaInicio("2016-12-12");
    	
    	servDocumento.actualizarDocumento(documento);

	    System.out.println("codigo:" + documento.getProyecto());
    
    	
    }
	
   
   
	@Test
	public void test() {
	
		List<DocumentoDTO> documentos;
		
		DocumentoDTO documento = new DocumentoDTO();
		
		documentos = servDocumento.listarDocumentos(documento);
		
		
		for(DocumentoDTO d:documentos){
			
			System.out.println("Codigo:"+ d.getDocumentoId());
		}
		
	}
	


}
