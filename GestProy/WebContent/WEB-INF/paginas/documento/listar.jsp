<%@ taglib prefix="s"  uri="/struts-tags" %>

<div id="page-wrapper">
	<div class="container-fluid">
       	<div class="base">
			<div class="cabecera">
				<div class="row">
			        <div class="col-md-12">
			            <h1 class="page-header">
			                <s:text name="md_titulo_listar"/>
			            </h1>
			        </div>
			    </div>
				<div class="row">
        			<div class="col-md-12">
						<form action="/GestProy/documento/buscarDocumento.action" method="post" class="form-inline" role="form">
							<div class="form-group">
								<label><s:text name="g_buscar_por"/>:</label>
								<select id="cboBusqueda" name="cboBusqueda" class="form-control">
									<option value='0'><s:text name="tb_documento_nombre"/></option>
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
				            <th><s:text name="tb_documento_nombre"/></th>
				            <th><s:text name="tb_documento_proyecto"/></th>
				            <th><s:text name="tb_documento_fechainicio"/></th>           
				            <th><s:text name="g_acciones"/></th>
				        </tr>
				    </thead>
				    <tbody>
						<s:iterator value="documentos" var="doc" >
							<tr>
								<td>
									<a href="<s:url action="cargarActualizarDocumento" namespace="/documento">
										<s:param name="documento.documentoId" value="#doc.documentoId"/> 
									</s:url>"><s:property value="#doc.nombre"/></a>
								</td>
							    <td><s:property value="#doc.proyecto.descripcion"/></td>
								<td><s:property value="#doc.fechaInicio"/></td>
								<td><input type="checkbox" data-id="<s:property value='#doc.documentoId'/>"/></td>
							</tr>	
						</s:iterator>
					</tbody>
				</table>
				
			</div>
			
			<div class="pie">
				<hr>
				<form class="form-inline" role="form">
					<button type="submit" class="btn btn-default" formaction="/GestProy/documento/cargarRegistrarDocumento.action" formmethod="post"><s:text name="g_registrar"/></button>
					<button id="btnEliminar" type="submit" class="btn btn-default" formaction="/GestProy/documento/eliminarDocumento.action" formmethod="post"><s:text name="g_eliminar"/></button>
					<input id="txtEliminar" name="txtEliminar" type="hidden">
				</form>
			</div>	
		</div>
	</div>
</div>