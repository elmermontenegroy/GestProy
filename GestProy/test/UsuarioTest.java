import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.gestproy.beans.UsuarioDTO;
import com.gestproy.service.UsuarioService;

public class UsuarioTest {
	
	UsuarioService servicioUsuario;
	
	@Before  
	public void antesDelTest() {  
		//1. Invoco al servicio para obtener datos del empleado
		servicioUsuario = new UsuarioService();
	}
	
	//@Test
	public void testRegistrarUsuario() {
		fail("Not yet implemented");
	}

	//@Test
	public void testActualizarUsuario() {
		fail("Not yet implemented");
	}

	//@Test
	public void testEliminarUsuario() {
		fail("Not yet implemented");
	}

	@Test
	public void testListarUsuarios() {
		List<UsuarioDTO> listUsuarios;
		UsuarioDTO usuario = new UsuarioDTO();
		usuario.setUsuario("emontenegro");
		listUsuarios = servicioUsuario.listarUsuarios(usuario);
		if(listUsuarios!=null && !listUsuarios.isEmpty()){
			System.out.println("OK");
		}else{
			System.out.println("BAD");
		}
	}

	//@Test
	public void testObtenerUsuario() {
		fail("Not yet implemented");
	}

}
