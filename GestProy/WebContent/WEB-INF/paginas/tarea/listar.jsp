<%@ taglib prefix="s"  uri="/struts-tags" %>

<div id="page-wrapper">
	<div class="container-fluid">
	    
	    <div class="row">
	        <div class="col-md-12">
	            <h1 class="page-header">
	                <s:text name="modulo.tarea.desc" />
	            </h1>
	        </div>
	    </div>
	    
	    <div class="row">
	        <div class="col-md-12">
	            <s:if test="!tareas.isEmpty">
					<table border=1>
						<tr>
							<td bgcolor="gray">TareaId</td>
							<td bgcolor="gray">ProyectoId</td>
							<td bgcolor="gray">Descripcion</td>
							<td bgcolor="gray">Fecha Inicio</td>
							<td bgcolor="gray">Fecha Fin</td>
							<td bgcolor="gray">Estado</td>
							<td bgcolor="gray">Actualizar</td>
							<td bgcolor="gray">Eliminar</td>
						</tr>
						<s:iterator value="tareas" var="tar" >
							<tr>
							    <td><s:property value="#tar.tareaId"/></td>
								<td><s:property value="#tar.proyecto.proyectoId"/></td>
								<td><s:property value="#tar.descripcion"/></td>
								<td><s:property value="#tar.fechaInicio"/></td>
								<td><s:property value="#tar.fechaFin"/></td>
								<td><s:property value="#tar.estado"/></td>
								<td>
									<a href="<s:url action="cargarActualizarTarea" namespace="/tarea">
										<s:param name="tarea.tareaId" value="#tar.tareaId"/>
									</s:url>">Actualizar</a>
								</td>
								<td>
									<a href="<s:url action="eliminarTarea" namespace="/tarea">
										<s:param name="tarea.tareaId" value="#tar.tareaId"/>
									</s:url>">Eliminar</a>
								</td>
							</tr>	
						</s:iterator>
					</table>
				</s:if>
				<a href="<s:url action="cargarRegistrarTarea" namespace="/tarea"/>">Registrar Tarea</a>
	        </div>
	    </div>
	</div>
</div>

