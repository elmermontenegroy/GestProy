<%@ taglib prefix="s"  uri="/struts-tags" %>

<div id="page-wrapper">
	<div class="container-fluid">
       	<div class="base">

       		<div class="cabecera">
				<div class="row">
			        <div class="col-md-12">
			            <h1 class="page-header">
			                <s:text name="md_titulo_actualizar"/>
			            </h1>
			        </div>
			    </div>
			    <hr>
			</div>
			<form class="form-horizontal" role="form">
				<div class="cuerpo">
					<div class="form-group">
					
						<label class="control-label col-md-2" for="txtNombre"><s:text name="tb_documento_nombre"/>:</label>
					    <div class="col-md-2">
					      <input type="hidden" class="form-control" style="display: none" id="txtDocumentoId" name="documento.documentoId" value="<s:property value="documento.documentoId"/>">
					      <input type="text" class="form-control" id="txtNombre" name="documento.nombre" value="<s:property value="documento.nombre"/>">
					    </div>
					    
					    <label class="control-label col-md-2" for="cboFecha"><s:text name="tb_documento_fechainicio"/>:</label>
					    <div class="col-md-2">
					     <input type="date" class="form-control" id="txtDescripcion" name="documento.fechaInicio" value="<s:property value="documento.fechaInicio"/>"   >
					  
					      
					    </div>
					    
					    <label class="control-label col-md-2" for="cboProyecto"><s:text name="tb_documento_documento"/>:</label>
					    <div class="col-md-2">
					      <select id="cboProyecto" name="documento.proyecto.proyectoId" class="form-control" >
					      	<s:iterator value="proyectos" var="py" >
					      		<option value='<s:property value="#py.proyectoId"/>' 
					      		        <s:if test="%{#py.proyectoId == documento.proyecto.proyectoId}"> selected </s:if>
					      		 ><s:property value="#py.descripcion"/></option>
					      	</s:iterator>
						  </select>
						  
					    </div>
					</div>
				</div>
			
			
				<div class="pie">
					<hr>
					<div class="form-inline" role="form">
					    <button type="submit" class="btn btn-default" formaction="/GestProy/documento/actualizarDocumento.action" formmethod="post"><s:text name="g_guardar"/></button>
						<button type="submit" class="btn btn-default" formaction="/GestProy/documento/inicializarDocumento.action" formmethod="post"><s:text name="g_cancelar"/></button>
					</div>
				</div>	
			</form>
       	</div>
	</div>
</div>