<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Listado de Tareas</title>
</head>
<body>

<h1 align="center">Listado de Tareas</h1>

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
				<td><s:property value="#tar.proyectoId"/></td>
				<td><s:property value="#tar.descripcion"/></td>
				<td><s:property value="#tar.fechaInicio"/></td>
				<td><s:property value="#tar.fechaFin"/></td>
				<td><s:property value="#tar.estado"/></td>
				<td>
					<a href="<s:url action="InicializarActualizarTareaAction">
						<s:param name="tarea.tareaId" value="#tar.tareaId"/>
					</s:url>">Actualizar</a>
				</td>
				<td>
					<a href="<s:url action="EliminarTareaAction">
						<s:param name="tarea.tareaId" value="#tar.tareaId"/>
					</s:url>">Eliminar</a>
				</td>
			</tr>	
		</s:iterator>
	</table>
</s:if>
  <p><a href="RegresarBienvenidoTareaAction">Salir del Listado</a></p>
</body>
</html>