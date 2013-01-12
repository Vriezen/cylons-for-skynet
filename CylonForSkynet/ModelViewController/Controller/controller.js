var $ = function (id) { return document.getElementById(id) }
var $$ = function (base, id) { return base.getElementById(id) }
var request
var session

/*
function submit_tacos() {

	request = new XMLHttpRequest()
	request.onreadystatechange = respond_answer
	request.open("POST", "../model/model.php", true )
	request.send( "response=tacos" )
	

}

function submit_gravy() {

	request = new XMLHttpRequest()
	request.onreadystatechange = respond_answer
	request.open("POST", "../model/model.php", true )
	request.send( "response=gravy" )

}

function respond_answer() {

	if( request.readyState != 4 ) return
	var result = eval( request.responseText )
	create_view(result)

}
*/

function submit_tacos() {

	process_answer("tacos")
	create_view(session)

}

function submit_gravy() {

	process_answer("gravy")
	create_view(session)

}

function submit_what() {

	process_answer("what")
	create_view(session)
	
}


function create_view(result) {

	var body = $("main")
		
	// remove the current children
	while (body.hasChildNodes()) {
		body.removeChild(body.lastChild);
	}
	
	if(result == "wrong") {
		set_view("what", body)
	}
	else if(result == "gravy tacos"){
		set_view("answer", body)
	}

}