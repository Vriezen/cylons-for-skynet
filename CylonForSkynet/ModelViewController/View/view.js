

function set_view(viewName, domBody) {

	if(viewName = "what") {
	
		var textElement = document.createElement('h1');

		textElement.appendChild(document.createTextNode("Wrong!"))
		
		domBody.appendChild(textElement)
		
	}
	else if(viewName = "gravy tacos") {
	
		var textElement = document.createElement('h1');

		textElement.appendChild(document.createTextNode("The correct answer is Gravy Tacos"))
		
		domBody.appendChild(textElement)
	
	}

}