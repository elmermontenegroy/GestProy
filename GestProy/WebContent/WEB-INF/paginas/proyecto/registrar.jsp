<%@ taglib prefix="s"  uri="/struts-tags" %>

<div id="page-wrapper">
	<div class="container-fluid">
       	<div class="base">

       		<div class="cabecera">
				<div class="row">
			        <div class="col-md-12">
			            <h1 class="page-header">
			                <s:text name="mp_titulo_insertar"/>
			            </h1>
			        </div>
			    </div>
			    <hr>
			</div>
			<form class="form-horizontal" role="form">
				<div class="cuerpo">
					<div class="form-group">
						<label class="control-label col-md-2" for="txtDescripcion"><s:text name="tb_proyecto_descripcion"/>:</label>
					    <div class="col-md-2">
					      <input type="text" class="form-control" id="txtDescripcion" name="proyecto.descripcion">
					    </div>
					    <label class="control-label col-md-2" for="cboEstado"><s:text name="tb_proyecto_estado"/>:</label>
					    <div class="col-md-2">
					      <select id="cboEstado" name="proyecto.estado" class="form-control">
					      		<option value='A'><s:text name="g_estado_activo"/></option>
					      		<option value='I'><s:text name="g_estado_inactivo"/></option>
						  </select>
					    </div>
					    <label class="control-label col-md-2" for="cboPortafolio"><s:text name="tb_portafolio_portafolio"/>:</label>
					    <div class="col-md-2">
					      <select id="cboPortafolio" name="proyecto.portafolio.portafolioId" class="form-control">
					      	<s:iterator value="portafolios" var="pf" >
					      		<option value='<s:property value="#pf.portafolioId"/>'><s:property value="#pf.descripcion"/></option>
					      	</s:iterator>
						  </select>
					    </div>
					</div>
				</div>
			
			
				<div class="pie">
					<hr>
					<div class="form-inline" role="form">
					    <button type="submit" class="btn btn-default" formaction="/GestProy/proyecto/registrarProyecto.action" formmethod="post"><s:text name="g_guardar"/></button>
						<button type="submit" class="btn btn-default" formaction="/GestProy/proyecto/inicializarProyecto.action" formmethod="post"><s:text name="g_cancelar"/></button>
					</div>
				</div>	
			</form>
       	</div>
	</div>
</div>