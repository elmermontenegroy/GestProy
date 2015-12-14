<%@ taglib prefix="s"  uri="/struts-tags" %>

<div id="page-wrapper">
	<div class="container-fluid">
       	<div class="base">
			<div class="cabecera">
				<div class="row">
			        <div class="col-md-12">
			            <h1 class="page-header">
			                <s:text name="mu_titulo_listar"/>
			            </h1>
			        </div>
			    </div>
				<div class="row">
        			<div class="col-md-12">
						<form action="/GestProy/usuario/buscarUsuario.action" method="post" class="form-inline" role="form">
							<div class="form-group">
								<label><s:text name="g_buscar_por"/>:</label>
								<select id="cboBusqueda" name="cboBusqueda" class="form-control">
									<option value='0' selected ><s:text name="tb_usuario_usuario"/></option>
									<option value='1'><s:text name="tb_usuario_nombre"/></option>
									<option value='2'><s:text name="tb_usuario_apellido"/></option>
								</select>
								<input id="txtBusqueda" name="txtBusqueda" type="text" class="form-control" aria-label="...">
								<button type="submit" class="btn btn-default"><s:text name="g_buscar"/></button>
							</div>
						</form>
					</div>
   				</div>
   				<hr>
			</div>
			
			<div class="cuerpo">
				<table id="tblListar" class="display" cellspacing="0" width="100%">
				    <thead>
				        <tr>
				            <th><s:text name="tb_usuario_nombre"/></th>
				            <th><s:text name="tb_usuario_apellido"/></th>
				            <th><s:text name="tb_usuario_usuario"/></th>
				            <th><s:text name="tb_usuario_email"/></th>
				            <th><s:text name="tb_usuario_fechaNacimiento"/></th>
				            <th><s:text name="tb_tipousuario_tipousuario"/></th>
				            <th><s:text name="tb_usuario_estado"/></th>
				            <th><s:text name="g_acciones"/></th>
				        </tr>
				    </thead>
				    <tbody>
						<s:iterator value="usuarios" var="usu" >
							<tr>
								<td>
									<a href="<s:url action="cargarActualizarUsuario" namespace="/usuario">
										<s:param name="usuario.usuarioId" value="#usu.usuarioId"/> 
									</s:url>"><s:property value="#usu.nombre"/></a>
								</td>
							    <td><s:property value="#usu.apellido"/></td>
								<td><s:property value="#usu.usuario"/></td>
								<td><s:property value="#usu.email"/></td>
								<td><s:property value="#usu.fechaNacimiento"/></td>
								<td><s:property value="#usu.tipoUsuario.descripcion"/></td>
								<td><s:property value="#usu.estadoToString"/></td>
								<td><input type="checkbox" data-id="<s:property value='#usu.usuarioId'/>"/></td>
							</tr>	
						</s:iterator>
					</tbody>
				</table>
				
			</div>
			
			<div class="pie">
				<hr>
				<form class="form-inline" role="form">
					<button type="submit" class="btn btn-default" formaction="/GestProy/usuario/cargarRegistrarUsuario.action" formmethod="post"><s:text name="g_registrar"/></button>
					<button id="btnEliminar" type="submit" class="btn btn-default" formaction="/GestProy/usuario/eliminarUsuario.action" formmethod="post"><s:text name="g_eliminar"/></button>
					<input id="txtEliminar" name="txtEliminar" type="hidden">
				</form>
			</div>	
		</div>
	</div>
</div>

