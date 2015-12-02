<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Actualizar una nueva Tarea</title>
</head>
<body>

<h1>Actualizar una nueva Tarea</h1>

<s:form action="ActualizarTareaAction">

	<s:textfield name="tarea.tareaId" label="Tarea Id" readonly="true"/>
	<s:textfield name="tarea.proyectoId" label="Proyecto Id"/>
	<s:textfield name="tarea.descripcion" label="Descripcion"/>
	<s:textfield name="tarea.fechaInicio" label="Fecha Inicio"/>
	<s:textfield name="tarea.fechaFin" label="Fecha Fin"/>
	<s:textfield name="tarea.estado" label="Estado"/>
	
	<s:submit value="Actualizar"/>
</s:form>

<s:if test="!tareas.isEmpty">
	<table border=1>
		<tr>
			<td bgcolor="gray">TareaId</td>
			<td bgcolor="gray">ProyectoId</td>
			<td bgcolor="gray">Descripcion</td>
			<td bgcolor="gray">Fecha Inicio</td>
			<td bgcolor="gray">Fecha Fin</td>
			<td bgcolor="gray">Estado</td>
		</tr>
		<s:iterator value="tareas" var="tar" >
			<tr>
			    <td><s:property value="#tar.tareaId"/></td>
				<td><s:property value="#tar.proyectoId"/></td>
				<td><s:property value="#tar.descripcion"/></td>
				<td><s:property value="#tar.fechaInicio"/></td>
				<td><s:property value="#tar.fechaFin"/></td>
				<td><s:property value="#tar.estado"/></td>
			</tr>	
		</s:iterator>
	</table>
</s:if>
   <p><a href="RefrescarActualizarTareaAction">Salir de la vista Actualizar</a></p>
</body>
</html>