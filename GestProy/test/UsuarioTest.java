import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.gestproy.beans.TipoUsuarioDTO;
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
		UsuarioDTO usuario = new UsuarioDTO();
		usuario.setTipoUsuario(new TipoUsuarioDTO());
		usuario.setUsuario("user");
		usuario.setClave("1234");
		usuario.setEmail("user@gmail.com");
		usuario.setNombre("name");
		usuario.setApellido("latname");
		usuario.setFechaNacimiento("2010/10/02");
		usuario.getTipoUsuario().setTipoUsuarioId(1);
		usuario.setEstado('A');
		servicioUsuario.registrarUsuario(usuario);
		System.out.println("UsuarioId: "+usuario.getUsuarioId());
	}

	@Test
	public void testActualizarUsuario() {
		UsuarioDTO usuario = new UsuarioDTO();
		usuario.setTipoUsuario(new TipoUsuarioDTO());
		usuario.setUsuarioId(12);
		//usuario.setUsuario("tbutler");
		//usuario.setClave("1234");
		//usuario.setEmail("tbutler@gmail.com");
		usuario.setNombre("Tiger4");
		//usuario.setApellido("Butler Terreros");
		//usuario.setFechaNacimiento("1992-06-03");
		//usuario.getTipoUsuario().setTipoUsuarioId(7);
		//usuario.setEstado('A');
		servicioUsuario.actualizarUsuario(usuario);
	}

	//@Test
	public void testEliminarUsuario() {
		servicioUsuario.eliminarUsuarios("9");
	}

	//@Test
	public void testListarUsuarios() {
		List<UsuarioDTO> listUsuarios;
		UsuarioDTO usuario = new UsuarioDTO();
		usuario.setUsuario("");
		listUsuarios = servicioUsuario.listarUsuarios(usuario);
		if(listUsuarios!=null && !listUsuarios.isEmpty()){
			for(UsuarioDTO u : listUsuarios){
				System.out.println(u.toString());
			}
		}else{
			System.out.println("MAL");
		}
	}

	//@Test
	public void testObtenerUsuario() {
		fail("Not yet implemented");
	}

}
