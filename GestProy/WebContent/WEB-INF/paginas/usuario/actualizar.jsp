<%@ taglib prefix="s" uri="/struts-tags"%>

	<h1>
		<s:text name="titulo.vendedor.edicion"/>
	</h1>

	<s:form action="editarVendedor" method="post"  namespace="/vendedor">

		<s:hidden name="vendedor.codigo" />

		<s:textfield name="vendedor.nombre" key="label.nombre"/>
		<s:textfield name="vendedor.apellido" key="label.apellido" />
		<s:select list="generos" name="vendedor.genero" key="label.genero" />

		<s:select list="distritos" name="vendedor.distrito.codigo"
			key="label.distrito" listKey="codigo" listValue="descripcion" />

		<s:submit value="%{getText('accion.grabar')}" />

	</s:form>

