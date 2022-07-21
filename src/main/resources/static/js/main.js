/**
 * 
 */

$('document').ready(function() {
	
	$('.table .btn-outline-primary').on('click',function(event){
		
		event.preventDefault();
		
		var href= $(this).attr('href');
		
		$.get(href, function(endpoint, status){
			$('#IdEdit').val(endpoint.id);
			$('#nameEdit').val(endpoint.ip_address);
			$('#departmentEdit').val(endpoint.port);
		});	
		
	
		
		$('#editModal').modal();
		
	});
	
	$('.table #deleteButton').on('click',function(event) {
		event.preventDefault();
		var href = $(this).attr('href');
		$('#deleteModal #delRef').attr('href', href);
		$('#deleteModal').modal();
		
	});
	
});