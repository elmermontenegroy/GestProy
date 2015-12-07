//$(document).ready(function() {
$(function() {
	$('#tblListar').DataTable({
		"scrollY":        "400px",
        "scrollCollapse": true,
        "paging":         false
	});
	
	$( "#btnEliminar" ).click(function() {
		var eliminar="";
		$("#tblListar input[type='checkbox']").each(function(index, value) { 
			if(value.checked){
				console.log(value.dataset.id);
				eliminar+=value.dataset.id+",";
			}
		});
		console.log(eliminar);
		console.log(eliminar.substring(0, eliminar.length-1))
		$("#txtEliminar").val(eliminar.substring(0, eliminar.length-1));
	});
	
});