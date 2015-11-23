package com.gestproy.action;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.gestproy.dataobjects.UsuarioDTO;
import com.gestproy.util.Constantes;
import com.opensymphony.xwork2.ActionSupport;

public class UsuarioAction extends ActionSupport implements SessionAware{
	
	private static final long serialVersionUID = 1470228705843594914L;
	
	//variables
	private UsuarioDTO usuario;
	private SessionMap<String, Object> session;
		
	//Implementaciones
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = (SessionMap<String, Object>)session;
	}
	
	//Metodos
	public String login() throws Exception{
		String vista="";
		//Llamar a los Servicios
		
		if(usuario.getUsuario().equals("admin")  && usuario.getClave().equals("1234")){
			//caso credenciales correctas
			session.put("usuario", usuario.getUsuario());

			//mensaje informativo
			String[] params=new String[]{"2015-11-10"};
			addActionMessage(getText(Constantes.MENSAJE_LOGIN_EXITO,params) ); 
			
			vista=SUCCESS;
		}else{
			//caso credenciales incorrectas
			addActionError(getText(Constantes.MENSAJE_LOGIN_VALIDACION));
			vista=LOGIN;
		}
		//retorna result
		return vista;
	}
	
	public String logout() throws Exception {
        //invalidamos sesion
        session.invalidate();
        return LOGIN;
	}
	
	//Obtener y Establecer
	public void setUsuario(UsuarioDTO usuario) {
		this.usuario = usuario;
	}

	public UsuarioDTO getUsuario() {
		return usuario;
	}
	
}
