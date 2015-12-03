<%@ taglib prefix="s"  uri="/struts-tags" %>

<div id="page-wrapper">
	<div class="container-fluid">
	    
	    <div class="row">
	        <div class="col-md-12">
	            <h1 class="page-header">
	                <s:text name="modulo.documento.desc" />
	            </h1>
	         </div>
	    </div>
	    
	    <div class="row">
	        <div class="col-md-12">
	            <s:if test="!documentos.isEmpty">
					<table border=1>
						<tr>
							<td bgcolor="gray">DocumentoId</td>
							<td bgcolor="gray">ProyectoId</td>
							<td bgcolor="gray">Nombre</td>
							<td bgcolor="gray">Fecha Inicio</td>
							<td bgcolor="gray">Actualizar</td>
							<td bgcolor="gray">Eliminar</td>
						</tr>
						<s:iterator value="documentos" var="doc" >
							<tr>
							    <td><s:property value="#doc.documentoId"/></td>
								<td><s:property value="#doc.proyecto.proyectoId"/></td>
								<td><s:property value="#doc.nombre"/></td>
								<td><s:property value="#doc.fechaInicio"/></td>
								<td>
									<a href="<s:url action="cargarActualizarDocumento" namespace="/documento">
										<s:param name="documento.documentoId" value="#doc.documentoId"/>
									</s:url>">Actualizar</a>
								</td>
								<td>
									<a href="<s:url action="eliminarDocumento" namespace="/documento">
										<s:param name="documento.documentoId" value="#doc.documentoId"/>
									</s:url>">Eliminar</a>
								</td>
							</tr>	
						</s:iterator>
					</table>
				</s:if>
				<a href="<s:url action="cargarRegistrarDocumento" namespace="/documento"/>">Registrar Documento</a>
	        </div>
	    </div>
	</div>
</div>

