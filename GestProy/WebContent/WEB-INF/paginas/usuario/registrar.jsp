<%@ taglib prefix="s"  uri="/struts-tags" %>

<div id="page-wrapper">
	<div class="container-fluid">
       	<div class="base">

       		<div class="cabecera">
				<div class="row">
			        <div class="col-md-12">
			            <h1 class="page-header">
			                <s:text name="mu_titulo_insertar"/>
			            </h1>
			        </div>
			    </div>
			    <hr>
			</div>
			<form class="form-horizontal" role="form">
				<div class="cuerpo">
					<div class="form-group">
						<label class="control-label col-md-1" for="txtNombre"><s:text name="tb_usuario_nombre"/>:</label>
					    <div class="col-md-2">
					      <input type="text" class="form-control" id="txtNombre" name="usuario.nombre">
					    </div>
					    <label class="control-label col-md-1" for="txtApellido"><s:text name="tb_usuario_apellido"/>:</label>
					    <div class="col-md-2">
					      <input type="text" class="form-control" id="txtApellido" name="usuario.apellido">
					    </div>
					    <label class="control-label col-md-1" for="txtUsuario"><s:text name="tb_usuario_usuario"/>:</label>
					    <div class="col-md-2">
					      <input type="text" class="form-control" id="txtUsuario" name="usuario.usuario">
					    </div>
					    <label class="control-label col-md-1" for="txtClave"><s:text name="tb_usuario_clave"/>:</label>
					    <div class="col-md-2">
					      <input type="text" class="form-control" id="txtClave" name="usuario.clave">
					    </div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-1" for="txtEmail"><s:text name="tb_usuario_email"/>:</label>
					    <div class="col-md-2">
					      <input type="email" class="form-control" id="txtEmail" name="usuario.email">
					    </div>
					    <label class="control-label col-md-1" for="txtFechaN"><s:text name="tb_usuario_fechaNacimiento"/>:</label>
					    <div class="col-md-2">
					      <input type="date" class="form-control" id="txtFechaN" name="usuario.fechaNacimiento">
					    </div>
					    <label class="control-label col-md-1" for="cboTipoUsuario"><s:text name="tb_tipousuario_tipousuario"/>:</label>
					    <div class="col-md-2">
					      <select id="cboTipoUsuario" name="usuario.tipoUsuario.tipoUsuarioId" class="form-control">
					      	<s:iterator value="tipoUsuarios" var="tipousu" >
					      		<option value='<s:property value="#tipousu.tipoUsuarioId"/>'><s:property value="#tipousu.descripcion"/></option>
					      	</s:iterator>
						  </select>
					    </div>
					    <label class="control-label col-md-1" for="cboEstado"><s:text name="tb_usuario_estado"/>:</label>
					    <div class="col-md-2">
					      <select id="cboEstado" name="usuario.estado" class="form-control">
					      		<option value='A'><s:text name="g_estado_activo"/></option>
					      		<option value='I'><s:text name="g_estado_inactivo"/></option>
						  </select>
					    </div>
					</div>
				</div>
			
			
				<div class="pie">
					<hr>
					<div class="form-inline" role="form">
					    <button type="submit" class="btn btn-default" formaction="/GestProy/usuario/registrarUsuario.action" formmethod="post"><s:text name="g_guardar"/></button>
						<button type="submit" class="btn btn-default" formaction="/GestProy/usuario/inicializarUsuario.action" formmethod="post"><s:text name="g_cancelar"/></button>
					</div>
				</div>	
			</form>
       	</div>
	</div>
</div>