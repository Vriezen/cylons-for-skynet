function process_answer(answer) {

	/*
	if(answer == "tacos") {
		return "wrong"
	}
	else if (answer == "gravy") {
		return "wrong"
	}
	else if (answer == "what") {
		return "gravy tacos"
	}
	*/
	
	submit_groovy_request(answer)

}

function submit_groovy_request(answer) {

	if( document.form.loggedIn.checked ) return
	
	request = new XMLHttpRequest()
	request.onreadystatechange = respond_answer
	request.open("GET", "localhost:8080", true)
	request.setRequestHeader("Content-Type", "text/plain");//application/x-www-form-urlencoded");	
	request.send( "answer=" + answer)

}

function respond_answer() {

	if( request.readyState != 4 ) return
	session = request.responseText


}