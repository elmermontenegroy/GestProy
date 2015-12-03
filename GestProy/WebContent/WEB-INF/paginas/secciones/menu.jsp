<%@ taglib prefix="s"  uri="/struts-tags" %>

<!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
<div class="collapse navbar-collapse navbar-ex1-collapse">
    <ul class="nav navbar-nav side-nav">
        <li class="active">
            <a href="index.html"><i class="fa fa-fw fa-dashboard"></i> Dashboard</a>
        </li>
        <li>
            <a href="javascript:;" data-toggle="collapse" data-target="#demo"><i class="fa fa-fw fa-arrows-v"></i> Mantenimientos <i class="fa fa-fw fa-caret-down"></i></a>
            <ul id="demo" class="collapse">
                <li>
                    <a href="<s:url action="inicializarUsuario" namespace="/usuario"/>">
						<s:text name="modulo.usuario" />
					</a>
                </li>
                <li>
                    <a href="<s:url action="inicializarPortafolio" namespace="/portafolio"/>">
						<s:text name="modulo.portafolio" />
					</a>
                </li>
                <li>
                    <a href="<s:url action="inicializarProyecto" namespace="/proyecto"/>">
						<s:text name="modulo.proyecto" />
					</a>
                </li>
                <li>
                    <a href="<s:url action="inicializarTarea" namespace="/tarea"/>">
						<s:text name="modulo.tarea" />
					</a>
                </li>
                <li>
                    <a href="<s:url action="inicializarDocumento" namespace="/documento"/>">
						<s:text name="modulo.documento" />
					</a>
                </li>
                <li>
                    <a href="<s:url action="inicializarIntegrante" namespace="/integrante"/>">
						<s:text name="modulo.integrante" />
					</a>
                </li>
            </ul>
        </li>
        <li>
            <a href="javascript:;" data-toggle="collapse" data-target="#demo2"><i class="fa fa-fw fa-arrows-v"></i> Reportes <i class="fa fa-fw fa-caret-down"></i></a>
            <ul id="demo2" class="collapse">
                <li>
                    <a href="#">Usuarios</a>
                </li>
                <li>
                    <a href="#">Portafolios</a>
                </li>
                <li>
                    <a href="#">Proyectos</a>
                </li>
                <li>
                    <a href="#">Tareas</a>
                </li>
                <li>
                    <a href="#">Documentos</a>
                </li>
                <li>
                    <a href="#">Integrantes</a>
                </li>
            </ul>
        </li>
        
        <li>
            <a href="blank-page.html"><i class="fa fa-fw fa-file"></i> Blank Page</a>
        </li>
    </ul>
</div>
