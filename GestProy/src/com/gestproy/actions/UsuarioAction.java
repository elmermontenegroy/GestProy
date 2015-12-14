package com.gestproy.actions;

import java.util.List;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.gestproy.beans.TipoUsuarioDTO;
import com.gestproy.beans.UsuarioDTO;
import com.gestproy.service.DocumentoService;
import com.gestproy.service.TipoUsuarioService;
import com.gestproy.service.UsuarioService;
import com.gestproy.util.Constantes;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class UsuarioAction extends ActionSupport implements SessionAware, Preparable{
	
	private static final long serialVersionUID = 1470228705843594914L;
	
	//variables
	private String cboBusqueda;
	private String txtBusqueda;
	private String txtEliminar;
	private UsuarioDTO usuario;
	private SessionMap<String, Object> session;
	private List<UsuarioDTO> usuarios;
	private List<TipoUsuarioDTO> tipoUsuarios;
	
	//servicios
	UsuarioService servicioUsuario = new UsuarioService();
	TipoUsuarioService servicioTipoUsuario = new TipoUsuarioService();
	
		
	//Implementaciones
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = (SessionMap<String, Object>)session;
	}
	
	@Override
	public void prepare() throws Exception {
		usuarios = servicioUsuario.listarUsuarios(new UsuarioDTO());
		tipoUsuarios = servicioTipoUsuario.listarTipoUsuarios(new TipoUsuarioDTO());
	}
	
	//Metodos de Sesiones
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
	
	//Metodos de Mantenimiento

	public String cargarRegistrar(){
		usuario = new UsuarioDTO();
		usuario.setTipoUsuario(new TipoUsuarioDTO());
		usuario.getTipoUsuario().setTipoUsuarioId(1);
		usuario.setEstado('A');
		return SUCCESS;
	}
	
	public String cargarActualizar(){
		usuario = servicioUsuario.obtenerUsuario(usuario.getUsuarioId());
		return SUCCESS;
	}
	
	public String buscar(){
		UsuarioDTO usuario = new UsuarioDTO();
		switch (cboBusqueda) {
			case "0":usuario.setUsuario(txtBusqueda);break;
			case "1":usuario.setNombre(txtBusqueda);break;
			case "2":usuario.setApellido(txtBusqueda);break;
		}
		usuarios = servicioUsuario.listarUsuarios(usuario);
		return SUCCESS;
	}
	
	public String registrar(){
		servicioUsuario.registrarUsuario(usuario);
		if(usuario.getUsuarioId()>0){
			usuarios = servicioUsuario.listarUsuarios(new UsuarioDTO());
			return SUCCESS;
		}
		return ERROR;
	}
	
	public String actualizar(){
		servicioUsuario.actualizarUsuario(usuario);
		usuarios = servicioUsuario.listarUsuarios(new UsuarioDTO());
		return SUCCESS;
	}
	
	public String eliminar(){
		servicioUsuario.eliminarUsuarios(txtEliminar);
		usuarios = servicioUsuario.listarUsuarios(new UsuarioDTO());
		return SUCCESS;
	}
	
	private boolean validar(){
		return true;
	}
	//Metodos de Reporte
	//Obtener y Establecer
	public String getCboBusqueda() {
		return cboBusqueda;
	}
	public void setCboBusqueda(String cboBusqueda) {
		this.cboBusqueda = cboBusqueda;
	}
	public String getTxtBusqueda() {
		return txtBusqueda;
	}
	public void setTxtBusqueda(String txtBusqueda) {
		this.txtBusqueda = txtBusqueda;
	}
	public UsuarioDTO getUsuario() {
		return usuario;
	}
	public void setUsuario(UsuarioDTO usuario) {
		this.usuario = usuario;
	}
	public List<UsuarioDTO> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(List<UsuarioDTO> usuarios) {
		this.usuarios = usuarios;
	}
	public String getTxtEliminar() {
		return txtEliminar;
	}
	public void setTxtEliminar(String txtEliminar) {
		this.txtEliminar = txtEliminar;
	}
	public List<TipoUsuarioDTO> getTipoUsuarios() {
		return tipoUsuarios;
	}
	public void setTipoUsuarios(List<TipoUsuarioDTO> tipoUsuarios) {
		this.tipoUsuarios = tipoUsuarios;
	}
}
