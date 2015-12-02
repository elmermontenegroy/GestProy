<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registrar una nuevo Documento</title>
</head>
<body>

<h1>Registrar una nuevo Documento </h1>

<s:form action="RegistrarDocumentoAction">

	<s:textfield name="documento.documentoId" label="Documento Id"/>
	<s:textfield name="documento.proyectoId" label="Proyecto Id"/>
	<s:textfield name="documento.nombre" label="Nombre"/>
	<s:textfield name="documento.fechaInicio" label="Fecha Inicio"/>

	
	<s:submit value="Registrar"/>
</s:form>

<s:if test="!documentos.isEmpty">
	<table border=1>
		<tr>
			<td bgcolor="gray">DocumentoId</td>
			<td bgcolor="gray">ProyectoId</td>
			<td bgcolor="gray">Nombre</td>
			<td bgcolor="gray">Fecha Inicio</td>
		</tr>
		<s:iterator value="documentos" var="doc" >
			<tr>
			    <td><s:property value="#doc.documentoId"/></td>
				<td><s:property value="#doc.proyectoId"/></td>
				<td><s:property value="#doc.nombre"/></td>
				<td><s:property value="#doc.fechaInicio"/></td>
			</tr>	
		</s:iterator>
	</table>
</s:if>
  <p><a href="RegresarBienvenidoDocumentoAction">Salir de la vista Registrar</a></p>
</body>
</html>