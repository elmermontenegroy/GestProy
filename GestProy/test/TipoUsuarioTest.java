import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.gestproy.beans.TipoUsuarioDTO;
import com.gestproy.beans.UsuarioDTO;
import com.gestproy.service.TipoUsuarioService;
import com.gestproy.service.UsuarioService;

public class TipoUsuarioTest {
	
	TipoUsuarioService servicioTipousuario;
	
	@Before  
	public void antesDelTest() {  
		//1. Invoco al servicio para obtener datos del empleado
		servicioTipousuario = new TipoUsuarioService();
	}

	@Test
	public void testListarUsuarios() {
		List<TipoUsuarioDTO> listTipoUsuarios;
		TipoUsuarioDTO tipoUsuario = new TipoUsuarioDTO();
		listTipoUsuarios = servicioTipousuario.listarTipoUsuarios(tipoUsuario);
		if(listTipoUsuarios!=null && !listTipoUsuarios.isEmpty()){
			for(TipoUsuarioDTO tu : listTipoUsuarios){
				System.out.println(tu.toString());
			}
		}else{
			System.out.println("MAL");
		}
	}

	
}
