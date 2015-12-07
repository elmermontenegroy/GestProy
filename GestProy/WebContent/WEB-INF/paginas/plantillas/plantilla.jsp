<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="tiles"  uri="http://tiles.apache.org/tags-tiles" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="Proyecto de gestion de Proyectos para PIT">
    <meta name="author" content="Elmer Montenegro Ybañez">
	<title>GestProy</title>
	<s:head/>
		<!-- Bootstrap Core CSS -->
	    <link href="<s:url value='/recursos/css/bootstrap.min.css'/>" rel="stylesheet" type="text/css">
	
	    <!-- Custom CSS -->
	    <link href="<s:url value='/recursos/css/sbadmin.css'/>" rel="stylesheet" type="text/css">

		<!-- Jquery DataTable -->
		<link href="<s:url value='/recursos/css/jquery.dataTables.css'/>" rel="stylesheet" type="text/css">
	
	    <!-- Custom Fonts -->
	    <link href="<s:url value='/recursos/font/font-awesome/css/font-awesome.min.css'/>" rel="stylesheet" type="text/css">
		
	    <!-- Nuestro Propio CSS-->
	    <link href="<s:url value='/recursos/css/general.css'/>" rel="stylesheet" type="text/css">
	   
	    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
	    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
	    <!--[if lt IE 9]>
	        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
	        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
	    <![endif]-->
	 
</head>
<body>

	<div id="wrapper">
		<!-- Navigation -->
		<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		    <!-- Brand and toggle get grouped for better mobile display -->
		    <div class="navbar-header">
		        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
		            <span class="sr-only">Toggle navigation</span>
		            <span class="icon-bar"></span>
		            <span class="icon-bar"></span>
		            <span class="icon-bar"></span>
		        </button>
		        <a class="navbar-brand" href="index.html">GestProy</a>
		    </div>
			<!-- CABECERA -->
			<tiles:insertAttribute name="cabecera"/>
			<!-- MENU -->
			<tiles:insertAttribute name="menu"/>
		</nav>
		
		<!-- CONTENIDO -->
		<tiles:insertAttribute name="contenido"/>
	</div>
	
    <!-- jQuery -->
    <script src="<s:url value='/recursos/js/jquery.js'/>"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="<s:url value='/recursos/js/bootstrap.min.js'/>"></script>

    <!-- Morris Charts JavaScript 
    <script src="<s:url value='/recursos/js/plugins/morris/raphael.min.js'/>"></script>
    <script src="<s:url value='/recursos/js/plugins/morris/morris.min.js'/>"></script>
    <script src="<s:url value='/recursos/js/plugins/morris/morris-data.js'/>"></script>
    -->
    
    <!-- Jquery DataTable -->
	<script src="<s:url value='/recursos/js/jquery.dataTables.js'/>"></script>
    
    
    <!-- SB Admin -->
    <script src="<s:url value='/recursos/js/general.js'/>"></script>
    
    <!-- Para agregar nuestros propios javascript en la pagina hija-->

</body>
</html>











