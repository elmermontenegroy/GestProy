<%@ taglib prefix="s"  uri="/struts-tags" %>

<div id="page-wrapper">
	<div class="container-fluid">
       	<div class="base">

       		<div class="cabecera">
				<div class="row">
			        <div class="col-md-12">
			            <h1 class="page-header">
			                <s:text name="mi_titulo_insertar"/>
			            </h1>
			        </div>
			    </div>
			    <hr>
			</div>
			<form class="form-horizontal" role="form">
				<div class="cuerpo">
					<div class="form-group">
						<label class="control-label col-md-1" for="txtNombre"><s:text name="tb_integrante_nombre"/>:</label>
					    <div class="col-md-2">
					      <input type="text" class="form-control" id="txtNombre" name="integrante.nombre">
					    </div>
					    <label class="control-label col-md-1" for="txtApellido"><s:text name="tb_integrante_apellido"/>:</label>
					    <div class="col-md-2">
					      <input type="text" class="form-control" id="txtApellido" name="integrante.apellido">
					    </div>
					    <label class="control-label col-md-1" for="cboTipoUsuario"><s:text name="tb_nombre_proyecto"/>:</label>
					    <div class="col-md-2">
					      <select id="cboProyecto" name="integrante.proyectoId.proyectoId" class="form-control">
					      	<s:iterator value="proyectoIds" var="proy" >
					      		<option value='<s:property value="#proy.proyectoId"/>'><s:property value="#proy.descripcion"/></option>
					      	</s:iterator>
						  </select>
					    </div>
					   
					</div>
					<div class="form-group">
						<label class="control-label col-md-1" for="txtEmail"><s:text name="tb_usuario_email"/>:</label>
					    <div class="col-md-2">
					      <input type="email" class="form-control" id="txtEmail" name="integrante.email">
					    </div>
					    <label class="control-label col-md-1" for="txtFechaN"><s:text name="tb_usuario_fechaNacimiento"/>:</label>
					    <div class="col-md-2">
					      <input type="date" class="form-control" id="txtFechaN" name="usuario.fechaNacimiento">
					    </div>
					   
					    <label class="control-label col-md-1" for="cboEstado"><s:text name="tb_usuario_estado"/>:</label>
					    <div class="col-md-2">
					      <select id="cboEstado" name="integrante.estado" class="form-control">
					      		<option value='A'><s:text name="g_estado_activo"/></option>
					      		<option value='I'><s:text name="g_estado_inactivo"/></option>
						  </select>
					    </div>
					</div>
				</div>
			
			
				<div class="pie">
					<hr>
					<div class="form-inline" role="form">
					    <button type="submit" class="btn btn-default" formaction="/GestProy/integrante/registrarIntegrante.action" formmethod="post"><s:text name="g_guardar"/></button>
						<button type="submit" class="btn btn-default" formaction="/GestProy/integrante/inicializarIntegrante.action" formmethod="post"><s:text name="g_cancelar"/></button>
					</div>
				</div>	
			</form>
       	</div>
	</div>
</div>