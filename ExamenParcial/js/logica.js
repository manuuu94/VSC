function seleccion() {
    if (document.getElementById('libroImpreso').checked) {
        //habilite y desahabilite el elemento con id numPaginas acorde a las reglas del negocio enunciadas
        document.getElementById('numPaginas').disabled = false;
        //habilite y desahabilite el elemento con id tiempo acorde a las reglas del negocio enunciadas
        document.getElementById('tiempo').disabled = true;
    } else if (document.getElementById('audioLibro').checked) {
        //habilite y desahabilite el elemento con id numPaginas acorde a las reglas del negocio enunciadas
        document.getElementById('numPaginas').disabled = true;
        //habilite y desahabilite el elemento con id tiempo acorde a las reglas del negocio enunciadas
        document.getElementById('tiempo').disabled = false;
    }
}

function guardar() {
    var response = false;
    try {
        //Escriba en consola y escriba guardando
        console.log("guardando");
        //Obtenga el valor del titulo utilizando document.getElementById
        var titulo = document.getElementById('titulo').value;
        //Obtenga el valor del titulo utilizando document.getElementById
        var precio = document.getElementById('precio').value;
        var numPaginas = document.getElementById('numPaginas').value;
        var tiempo = document.getElementById('tiempo').value;
        //almacene la información del titulo utilizando cookies, el nombre (llave) de la variable cookie debe denominarse tiempo,, cuyo vencimiento sean 30 días
        setCookie('titulo', tiempo, 30);
        //almacene la información del precio utilizando almacenamineto local, el nombre (llave) de la variable local debe denominarse precio
        localStorage.setItem("precio", precio);
        //almacene la información del numero de página utilizando almacenamineto de session, el nombre (llave) de la variable de sesion debe denominarse numPaginas
        sessionStorage.setItem("numPaginas", numPaginas);
        //almacene la información del tiempo de página utilizando almacenamineto de session, el nombre (llave) de la variable de sesion debe denominarse tiempo
        sessionStorage.setItem("tiempo", tiempo);
        response = true;
    } catch (error) {
        console.error(error);
    }
    return response;
}


function setCookie(cname, cvalue, exdays) {
    var d = new Date();
    d.setTime(d.getTime() + (exdays * 24 * 60 * 60 * 1000));
    var expires = "expires=" + d.toGMTString();
    document.cookie = cname + "=" + cvalue + ";" + expires + ";path=/";
}