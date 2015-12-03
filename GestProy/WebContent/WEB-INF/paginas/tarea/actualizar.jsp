<%@ taglib prefix="s" uri="/struts-tags" %>

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
 
				<s:form action="actualizarTarea" namespace="/tarea">
				
					<s:textfield name="tarea.tareaId" label="Tarea Id" readonly="true"/>
					<s:textfield name="tarea.proyecto.proyectoId" label="Proyecto Id"/>
					<s:textfield name="tarea.descripcion" label="Descripcion"/>
					<s:textfield name="tarea.fechaInicio" label="Fecha Inicio"/>
					<s:textfield name="tarea.fechaFin" label="Fecha Fin"/>
					<s:textfield name="tarea.estado" label="Estado"/>
					
					<s:submit value="Actualizar"/>
				</s:form>
				<a href="<s:url action="inicializarTarea" namespace="/tarea"/>">Cancelar</a>
	        </div>
	    </div>
	</div>
</div>