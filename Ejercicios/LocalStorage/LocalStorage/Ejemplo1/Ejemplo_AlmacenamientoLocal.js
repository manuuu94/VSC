function guardarDatos() {
	if (window["localStorage"]) {
		//Una manera de almacenar informacion
    	localStorage.setItem("bienvenida", "Bienvenido al mundo de HTML5!");
    	//otra manera de almacenar información
    	localStorage.nombre = document.getElementById("nombre").value;
    	localStorage.password = document.getElementById("password").value;
    	//almacenar numeros
    	localStorage.setItem('numero',5);
    	localStorage.setItem('flotante',9.99); 
    	// //otra forma de almacenar la información
    	localStorage['apodo'] = 'Monillo007';
    }else{
		//NO soporta almacenamiento local
		alert('Tu navegador es demasiado viejo, ¡actualízate!');
	}
}

function recuperarDatos() {
    if ((localStorage.nombre != undefined) && (localStorage.password != undefined)) {

    	var tarea = localStorage.getItem("bienvenida");
    	//Recuperar un numero
     	var miNumero = parseInt(localStorage.getItem('numero'));
		var precio = parseFloat(localStorage.getItem('flotante'));
		// //otra forma de recuperar la información
		var apodo = localStorage['apodo'];

        document.getElementById("datos").innerHTML = tarea + " Nombre: " + localStorage.nombre + " Password: " + localStorage.password;
    } else {
        document.getElementById("datos").innerHTML = "No has introducido tu nombre y tu password";
    }

    for (var i = 0; i < localStorage.length; i++) { 
    	var llave = localStorage.key(i); 
    	var valor = localStorage[llave]; 
    	alert(valor); 

    	//Eliminando el elemento tarea_1
    	if (llave == "apodo"){
    		alert("Eliminando " + valor); 
    		localStorage.removeItem(llave);
    	}
	}
	//Elimina todos los elementos
	localStorage.clear();
}