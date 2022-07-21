/**
 * 
 */

$('document').ready(function() {
	
	$('.table .btn-outline-primary').on('click',function(event){
		
		event.preventDefault();
		
		var href= $(this).attr('href');
		
				
		$.get(href, function(urlendpoint, status){
			$('#IdEditurl').val(urlendpoint.id);
			$('#endpointurl').val(urlendpoint.endpointurl);
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