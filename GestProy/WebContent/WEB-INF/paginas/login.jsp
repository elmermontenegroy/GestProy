<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<!-- Bootstrap Core CSS -->
	    <link href="<s:url value='/recursos/css/bootstrap.min.css'/>" rel="stylesheet" type="text/css">
		<link href="<s:url value='/recursos/css/general.css'/>" rel="stylesheet" type="text/css">
		<title><s:text name="parrafo.login"/></title>
		<s:head />
	</head>
	<body>
		<!-- Configuraciones Previas de manejo de Idioma -->
		<s:url id="idiomaEn" action="idioma">
			<s:param name="request_locale">en</s:param>
		</s:url>
		<s:url id="idiomaEs" action="idioma">
			<s:param name="request_locale">es</s:param>
		</s:url>
		

			
	    <div class="container" style="margin-top:40px">
			<div class="row">
				<div class="col-sm-6 col-md-4 col-md-offset-4">
					<div class="panel panel-default">
						<div class="panel-heading">
							<div class="row">
								<div class="col-md-6">
									<s:text name="parrafo.login"/>
								</div>
								<div class="col-md-3">
									<s:a href="%{idiomaEn}">
										<s:text name="idioma.ingles"/>
									</s:a>
								</div>
								<div class="col-md-3">
									<s:a href="%{idiomaEs}">
										<s:text name="idioma.espanol"/>
									</s:a>
								</div>
							</div>
						</div>
						<div class="panel-body">
							<div class="row">
								<div class="center-block">
									<img class="profile-img"
										src="https://lh5.googleusercontent.com/-b0-k99FZlyE/AAAAAAAAAAI/AAAAAAAAAAA/eu7opA4byxI/photo.jpg?sz=120" alt="">
								</div>
							</div>
							<s:form action="loginUsuario" namespace="/seguridad">
								<div class="row">
									<div class="col-sm-12 col-md-10  col-md-offset-1 ">
										<s:textfield cssClass="form-control" key='label.usuario'  name="usuario.usuario"/>
										<s:password cssClass="form-control" key='label.contrasena' name="usuario.clave" />
										<s:submit cssClass="btn btn-lg btn-primary btn-block" value="%{getText('accion.login')}" />
									</div>
								</div>
							</s:form>
							<s:actionerror />
						</div>
	                </div>
				</div>
			</div>
		</div>
		
			
		<!-- jQuery -->
	    <script src="recursos/js/jquery.js"></script>		
		<!-- Bootstrap Core JavaScript -->
	    <script src="recursos/js/bootstrap.min.js"></script>
		
	</body>
</html>