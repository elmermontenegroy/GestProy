<%@ taglib prefix="s"  uri="/struts-tags" %>

<div id="page-wrapper">
	<div class="container-fluid">
       	<div class="base">
			<div class="cabecera">
				<div class="row">
			        <div class="col-md-12">
			            <h1 class="page-header">
			                <s:text name="mi_titulo_listar"/>
			            </h1>
			        </div>
			    </div>
				<div class="row">
        			<div class="col-md-12">
						<form action="/GestProy/integrante/buscarIntegrante.action" method="post" class="form-inline" role="form">
							<div class="form-group">
								<label><s:text name="g_buscar_por"/>:</label>
								<select id="cboBusqueda" name="cboBusqueda" class="form-control">
									<option value='0'><s:text name="tb_integrante_nombre"/></option>
									<option value='1'><s:text name="tb_integrante_apellido"/></option>
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
				            <th><s:text name="tb_integrante_proyecto"/></th>
				            <th><s:text name="tb_integrante_email"/></th>
				            <th><s:text name="tb_integrante_fechaNacimiento"/></th>
				            <th><s:text name="tb_integrante_estado"/></th>
				            <th><s:text name="g_acciones"/></th>
				        </tr>
				    </thead>
				    <tbody>
						<s:iterator value="integrantes" var="int" >
							<tr>
								<td>
									<a href="<s:url action="cargarActualizarIntegrante" namespace="/integrante">
										<s:param name="integrante.integranteId" value="#int.integranteId"/> 
									</s:url>"><s:property value="#int.nombre"/></a>
								</td>
								<td><s:property value="#int.apellido"/></td>
								<td><s:property value="#int.proyectoId.descripcion"/></td>
								<td><s:property value="#int.email"/></td>
								<td><s:property value="#int.fechaNacimiento"/></td>
								<td><s:property value="#int.estadoToString"/></td>			
								<td><input type="checkbox" data-id="<s:property value='#int.integranteId'/>"/></td>
							</tr>	
						</s:iterator>
					</tbody>
				</table>
				
			</div>
			
			<div class="pie">
				<hr>
				<form class="form-inline" role="form">
					<button type="submit" class="btn btn-default" formaction="/GestProy/integrante/cargarRegistrarIntegrante.action" formmethod="post"><s:text name="g_registrar"/></button>
					<button id="btnEliminar" type="submit" class="btn btn-default" formaction="/GestProy/integrante/eliminarIntegrante.action" formmethod="post"><s:text name="g_eliminar"/></button>
					<input id="txtEliminar" name="txtEliminar" type="hidden">
				</form>
			</div>	
		</div>
	</div>
</div>

