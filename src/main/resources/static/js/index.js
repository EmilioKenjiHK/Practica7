const form = document.querySelector("#signup");

// show a message with a type of the input
const showMessage = (input, message, type) => {
	// get the small element and set the message
	const msg = input.parentNode.querySelector("small");
	msg.innerText = message;
	// update the class for the input
	input.className = type ? "success" : "error";
	return type;
}

const showError = (input, message) => {
	return showMessage(input, message, false);
}

const showSuccess = (input) => {
	return showMessage(input, "", true);
}

const hasValue = (input, message) => {
	if (input.value.trim() === "") {
		return showError(input, message);
	}
	return showSuccess(input);
}

const NAME_REQUIRED = "Nombre es requerido";
const LNAME_REQUIRED = "Apellido es requerido";

// FUNCION PARA INTERACTUAR CON BASE DE DATOS
/*
const sendData = async(n,ln,g,o) => {

    //console.log(n);
    //console.log(ln);
    //console.log(g);
    //console.log(o);

    let request = await fetch("/cuestionario", {
        method: "POST",
        body: JSON.stringify({
            name: n,
            lname: ln,
            genero: g,
            opinion: o,
        }),
        credentials: "same-origin",
        headers: {
            "Content-Type": "application/json", // formato JSON
        },
        dataType: "json",
    });

    if(request.status == 200) {
        alert("Cuestionario Enviado, Si gustaria acceder las respuestas de otros, pulsa el boton: 'Respuestas Previas'");
    }
}
*/

const getUsers = async() => {

    let request = await fetch("https://cors-anywhere.herokuapp.com/http://localhost:8080/h2/api/v1/user");
    console.log(request.status);
    // Caso exito
    if(request.status == 200) {
        let dato = await request.json();
        console.log("Ha funcionado");
    }
}

$("#submit").on("click", () => {
    let name = form.elements["name"];
    let lname = form.elements["lname"];

    let nameValid = hasValue(name, NAME_REQUIRED);
	let lnameValid = hasValue(lname, LNAME_REQUIRED);

    getUsers();
    
    if(nameValid && lnameValid)
    {
       // sendData(name.value,lname.value,gender.value,opinion.value);
       //window.location = "pregunta.html";
    }
});
