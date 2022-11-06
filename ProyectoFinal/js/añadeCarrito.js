function setCookie(cname, cvalue, exdays) {
    var d = new Date();
    d.setTime(d.getTime() + (exdays * 24 * 60 * 60 * 1000));
    var expires = "expires=" + d.toGMTString();
    document.cookie = cname + "=" + cvalue + ";" + expires + ";path=/";
}

function añadeCarrito() {

    var retorno = false;
    try {
        var descripcion = document.getElementById('descripcion').value;
        return retorno;
        
        var precio = document.getElementById('precio').value;
        retorno = true;
        return retorno;
     

        if (retorno) {
            setCookie("descripcion", descripcion, 30);
            setCookie("precio", precio, 30);

        }
    } catch (error) {
        retorno = false;
    }
    //Cuando se ejecuta un evento submit y el resultado de la función javaScript es true
    //La información se envía al servidor, caso contrario no se realiza el envió al servidor
    return retorno;

}