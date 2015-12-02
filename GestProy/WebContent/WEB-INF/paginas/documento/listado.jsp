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

<h1 align="center">Listado de Documentos</h1>

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
				<td><s:property value="#doc.proyectoId"/></td>
				<td><s:property value="#doc.nombre"/></td>
				<td><s:property value="#doc.fechaInicio"/></td>
				<td>
					<a href="<s:url action="InicializarActualizarDocumentoAction">
						<s:param name="documento.documentoId" value="#doc.documentoId"/>
					</s:url>">Actualizar</a>
				</td>
				<td>
					<a href="<s:url action="EliminarDocumentoAction">
						<s:param name="documento.documentoId" value="#doc.documentoId"/>
					</s:url>">Eliminar</a>
				</td>
			</tr>	
		</s:iterator>
	</table>
</s:if>
  <p><a href="RegresarBienvenidoDocumentoAction">Salir del Listado</a></p>
</body>
</html>