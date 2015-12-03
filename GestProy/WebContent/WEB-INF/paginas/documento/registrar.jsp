<%@ taglib prefix="s" uri="/struts-tags" %>

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

				<s:form action="registrarDocumento" namespace="/documento">
				
					<s:textfield name="documento.documentoId" label="Documento Id"/>
					<s:textfield name="documento.proyecto.proyectoId" label="Proyecto Id"/>
					<s:textfield name="documento.nombre" label="Nombre"/>
					<s:textfield name="documento.fechaInicio" label="Fecha Inicio"/>
					
					<s:submit value="Registrar"/>
				</s:form>
				<p><a href="<s:url action="inicializarDocumento" namespace="/documento"/>">Cancelar</a></p>
				
			</div>
	    </div>
	</div>
</div>
