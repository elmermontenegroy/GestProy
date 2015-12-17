<%@ taglib prefix="s"  uri="/struts-tags" %>

<div id="page-wrapper">
	<div class="container-fluid">
       	<div class="base">
			<div class="cabecera">
				<div class="row">
			        <div class="col-md-12">
			            <h1 class="page-header">
			                <s:text name="mp_titulo_listar"/>
			            </h1>
			        </div>
			    </div>
				<div class="row">
        			<div class="col-md-12">
						<form action="/GestProy/proyecto/buscarProyecto.action" method="post" class="form-inline" role="form">
							<div class="form-group">
								<label><s:text name="g_buscar_por"/>:</label>
								<select id="cboBusqueda" name="cboBusqueda" class="form-control">
									<option value='0' selected ><s:text name="tb_proyecto_descripcion"/></option>
									<option value='1'><s:text name="tb_proyecto_estado"/></option>
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
				            <th><s:text name="tb_proyecto_descripcion"/></th>
				            <th><s:text name="tb_proyecto_estado"/></th>
				            <th><s:text name="tb_portafolio_portafolio"/></th>
				            <th><s:text name="g_acciones"/></th>
				        </tr>
				    </thead>
				    <tbody>
						<s:iterator value="proyectos" var="pro" >
							<tr>
								<td>
									<a href="<s:url action="cargarActualizarProyecto" namespace="/proyecto">
										<s:param name="proyecto.proyectoId" value="#pro.proyectoId"/> 
									</s:url>"><s:property value="#pro.descripcion"/></a>
								</td>
								<td><s:property value="#pro.estadoToString"/></td>							    
								<td><s:property value="#pro.portafolio.descripcion"/></td>
								<td><input type="checkbox" data-id="<s:property value='#pro.proyectoId'/>"/></td>
							</tr>	
						</s:iterator>
					</tbody>
				</table>
				
			</div>
			
			<div class="pie">
				<hr>
				<form class="form-inline" role="form">
					<button type="submit" class="btn btn-default" formaction="/GestProy/proyecto/cargarRegistrarProyecto.action" formmethod="post"><s:text name="g_registrar"/></button>
					<button id="btnEliminar" type="submit" class="btn btn-default" formaction="/GestProy/proyecto/eliminarProyecto.action" formmethod="post"><s:text name="g_eliminar"/></button>
					<input id="txtEliminar" name="txtEliminar" type="hidden">
				</form>
			</div>	
		</div>
	</div>
</div>

