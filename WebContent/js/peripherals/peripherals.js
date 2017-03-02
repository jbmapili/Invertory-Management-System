
function loadPeripherals(){
	new Ajax.Request(context + "/PeripheralsController",{
		method: "post",
		parameters : {
			
		},
		onSuccess : function(response){
			$('nav').update(response.responseText);
		},
		onFailure: function(response){
			alert("Something went wrong! :(");
		}
	});
}